package com.example.pc.bscitsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class Bjp extends AppCompatActivity implements OnPageChangeListener,OnLoadCompleteListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    String pdfFileName;
    PDFView pd;
    Integer pageNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjp);

        Intent intent=getIntent();

        pageNumber=intent.getIntExtra("pg_no",0);
        pdfFileName=intent.getStringExtra("file");
        Toolbar toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);



        pd=(PDFView)findViewById(R.id.pdfView);
        pd.fromAsset(intent.getStringExtra("file"))
                .defaultPage(pageNumber)
                .onPageChange(this)
                .enableSwipe(true)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();


    }

    @Override
    public void loadComplete(int nbPages) {

        PdfDocument.Meta meta = pd.getDocumentMeta();
        printBookmarksTree(pd.getTableOfContents(), "-");

    }

    @Override
    public void onPageChanged(int page, int pageCount) {

        pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));

    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }
}
