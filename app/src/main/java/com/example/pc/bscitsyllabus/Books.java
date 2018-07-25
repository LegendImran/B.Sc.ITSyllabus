package com.example.pc.bscitsyllabus;

import android.app.DownloadManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Books extends AppCompatActivity {

    Toolbar toolbar;
    CardView dec,dmc,ipc,osc,gc1c,gc2c,oopc,wdc,nsc,cnc,ppc,cgc,esc,cjc,sec;
    ImageButton ded,deb,dmd,dmb,ipd,ipb,osd,osb,gc1d,gc1b,gc2d,gc2b,oopd,oopb,wdd,wdb,nsd,nsb,cnd,cnb,ppd,ppb,cgd,cgb,esd,esb;
    ImageButton cjd,cjb,sed,seb;
    DownloadManager downloadManager;
    CardView dedes,dmdes,ipdes,osdes,gc1des,gc2des,oopdes,wddes,nsdes,cndes,ppdes,cgdes,esdes,cjdes,sedes;
    TextView det,dmt,ipt,ost,gc1t,gc2t,oopt,wdt,nst,cnt,ppt,cgt,est,cjt,set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
       /* dec=(CardView)findViewById(R.id.dec);
        dmc=(CardView)findViewById(R.id.dmc);
        ipc=(CardView)findViewById(R.id.ipc);
        osc=(CardView)findViewById(R.id.osc);
        gc1c=(CardView)findViewById(R.id.gc1c);
        gc2c=(CardView)findViewById(R.id.gc2c);
        oopc=(CardView)findViewById(R.id.oopc);
        wdc=(CardView)findViewById(R.id.wdc);
        cnc=(CardView)findViewById(R.id.cnc);
        ppc=(CardView)findViewById(R.id.ppc);
        cgc=(CardView)findViewById(R.id.cgc);
        esc=(CardView)findViewById(R.id.esc);
        cjc=(CardView)findViewById(R.id.cjc);
        sec=(CardView)findViewById(R.id.sec);*/

        dedes=(CardView)findViewById(R.id.dedes);
        dmdes=(CardView)findViewById(R.id.dmdes);
        ipdes=(CardView)findViewById(R.id.ipdes);
        osdes=(CardView)findViewById(R.id.osdes);
        gc1des=(CardView)findViewById(R.id.gc1des);
        gc2des=(CardView)findViewById(R.id.gc2des);
        oopdes=(CardView)findViewById(R.id.oopdes);
        wddes=(CardView)findViewById(R.id.wddes);
        nsdes=(CardView)findViewById(R.id.nsdes);
        cndes=(CardView)findViewById(R.id.cndes);
        ppdes=(CardView)findViewById(R.id.ppdes);
        cgdes=(CardView)findViewById(R.id.cgdes);
        esdes=(CardView)findViewById(R.id.esdes);
        cjdes=(CardView)findViewById(R.id.cjdes);
        sedes=(CardView)findViewById(R.id.sedes);

        ded=(ImageButton) findViewById(R.id.ded);
        deb=(ImageButton) findViewById(R.id.deb);
        dmd=(ImageButton) findViewById(R.id.dmd);
        dmb=(ImageButton) findViewById(R.id.dmb);
        ipd=(ImageButton) findViewById(R.id.ipd);
        ipb=(ImageButton) findViewById(R.id.ipb);
        osd=(ImageButton) findViewById(R.id.osd);
        osb=(ImageButton) findViewById(R.id.osb);
        gc1d=(ImageButton) findViewById(R.id.gc1d);
        gc1b=(ImageButton) findViewById(R.id.gc1b);
        gc2d=(ImageButton) findViewById(R.id.gc2d);
        gc2b=(ImageButton) findViewById(R.id.gc2b);
        oopd=(ImageButton) findViewById(R.id.oopd);
        oopb=(ImageButton) findViewById(R.id.oopb);
        wdd=(ImageButton) findViewById(R.id.wdd);
        wdb=(ImageButton) findViewById(R.id.wdb);
        nsd=(ImageButton) findViewById(R.id.nsd);
        nsb=(ImageButton) findViewById(R.id.nsb);
        cnd=(ImageButton) findViewById(R.id.cnd);
        cnb=(ImageButton) findViewById(R.id.cnb);
        ppd=(ImageButton) findViewById(R.id.ppd);
        ppb=(ImageButton) findViewById(R.id.ppb);
        cgd=(ImageButton) findViewById(R.id.cgd);
        cgb=(ImageButton) findViewById(R.id.cgb);
        esd=(ImageButton) findViewById(R.id.esd);
        esb=(ImageButton) findViewById(R.id.esb);
        cjd=(ImageButton) findViewById(R.id.cjd);
        cjb=(ImageButton) findViewById(R.id.cjb);
        sed=(ImageButton) findViewById(R.id.sed);
        seb=(ImageButton) findViewById(R.id.seb);

        det=(TextView)findViewById(R.id.det);
        dmt=(TextView)findViewById(R.id.dmt);
        ipt=(TextView)findViewById(R.id.ipt);
        ost=(TextView)findViewById(R.id.ost);
        gc1t=(TextView)findViewById(R.id.gc1t);
        gc2t=(TextView)findViewById(R.id.gc2t);
        oopt=(TextView)findViewById(R.id.oopt);
        wdt=(TextView)findViewById(R.id.wdt);
        nst=(TextView)findViewById(R.id.nst);
        cnt=(TextView)findViewById(R.id.cnt);
        ppt=(TextView)findViewById(R.id.ppt);
        cgt=(TextView)findViewById(R.id.cgt);
        est=(TextView)findViewById(R.id.est);
        cjt=(TextView)findViewById(R.id.cjt);
        set=(TextView)findViewById(R.id.set);


        deb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dedes.getVisibility() == View.GONE)
                    dedes.setVisibility(View.VISIBLE);
                else
                    dedes.setVisibility(View.GONE);
            }
        });

        dmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dmdes.getVisibility() == View.GONE)
                    dmdes.setVisibility(View.VISIBLE);
                else
                    dmdes.setVisibility(View.GONE);
            }
        });

        ipb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ipdes.getVisibility() == View.GONE)
                    ipdes.setVisibility(View.VISIBLE);
                else
                    ipdes.setVisibility(View.GONE);
            }
        });

        osb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(osdes.getVisibility() == View.GONE)
                    osdes.setVisibility(View.VISIBLE);
                else
                    osdes.setVisibility(View.GONE);
            }
        });

        gc1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gc1des.getVisibility() == View.GONE)
                    gc1des.setVisibility(View.VISIBLE);
                else
                    gc1des.setVisibility(View.GONE);
            }
        });

        gc2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gc2des.getVisibility() == View.GONE)
                    gc2des.setVisibility(View.VISIBLE);
                else
                    gc2des.setVisibility(View.GONE);
            }
        });

        oopb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(oopdes.getVisibility() == View.GONE)
                    oopdes.setVisibility(View.VISIBLE);
                else
                    oopdes.setVisibility(View.GONE);
            }
        });

        wdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wddes.getVisibility() == View.GONE)
                    wddes.setVisibility(View.VISIBLE);
                else
                    wddes.setVisibility(View.GONE);
            }
        });

        nsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nsdes.getVisibility() == View.GONE)
                    nsdes.setVisibility(View.VISIBLE);
                else
                    nsdes.setVisibility(View.GONE);
            }
        });

        cnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cndes.getVisibility() == View.GONE)
                    cndes.setVisibility(View.VISIBLE);
                else
                    cndes.setVisibility(View.GONE);
            }
        });

        ppb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ppdes.getVisibility() == View.GONE)
                    ppdes.setVisibility(View.VISIBLE);
                else
                    ppdes.setVisibility(View.GONE);
            }
        });

        cgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cgdes.getVisibility() == View.GONE)
                    cgdes.setVisibility(View.VISIBLE);
                else
                    cgdes.setVisibility(View.GONE);
            }
        });

        esb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(esdes.getVisibility() == View.GONE)
                    esdes.setVisibility(View.VISIBLE);
                else
                    esdes.setVisibility(View.GONE);
            }
        });

        cjb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cjdes.getVisibility() == View.GONE)
                    cjdes.setVisibility(View.VISIBLE);
                else
                    cjdes.setVisibility(View.GONE);
            }
        });

        seb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sedes.getVisibility() == View.GONE)
                    sedes.setVisibility(View.VISIBLE);
                else
                    sedes.setVisibility(View.GONE);
            }
        });

        ded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/S1DER P Jain - Modern Digital Electronics .pdf";
                    det.setText("SUBJECT : Digital Electronics; TITLE : Modern Digital Electronics; Auther : R.P. Jain; PUBLISHER : TMH;  EDITION : 4th; SIZE : 50mb");
                    down(add);
                }
                else {
                    dedes.setVisibility(View.VISIBLE);
                    det.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });


        dmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/S1DM Epp S.S. - Discrete mathematics with applications.pdf";
                    dmt.setText("SUBJECT : Discrete Mathematics; TITLE : Discrete Mathematics with Applications; Auther : Sussana S. Epp; PUBLISHER : Cengage Learning;  EDITION : 4th; SIZE : 8mb");
                    down(add);
                }
                else {
                    dmdes.setVisibility(View.VISIBLE);
                    dmt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        ipd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/S1IPYashavant Kanetkar-Let Us C-BPB Publications (2004).pdf";
                    ipt.setText("SUBJECT : Imperative Programmimng; TITLE : Let us C; Auther : Yashwant P. Kanetkar; PUBLISHER : BPB;  EDITION : 5th; SIZE : 3.36mb");
                    down(add);
                }
                else {
                    ipdes.setVisibility(View.VISIBLE);
                    ipt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        osd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/S1OS ASTH- Modern operating system.pdf";
                    ost.setText("SUBJECT : Operating Systems; TITLE : Modern Operating Systems; Auther : Andrew S.Tanenbaum,Herbert Bos; PUBLISHER : Pearson;  EDITION : 4th; SIZE : 4.5mb");
                    down(add);
                }
                else {
                    osdes.setVisibility(View.VISIBLE);
                    ost.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        gc1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem2 GC Toby Velte - Green IT.pdf";
                    gc1t.setText("SUBJECT :Green Computing; TITLE : Green IT; Auther : Toby Velte,Anthony Velte,Robert Elsenpeter; PUBLISHER : TMH; SIZE : 8mb");
                    down(add);
                }
                else {
                    gc1des.setVisibility(View.VISIBLE);
                    gc1t.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        gc2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem2GCJason Harris - Green Computing and Green.pdf";
                    gc2t.setText("SUBJECT : Green Computing; TITLE :Green Computing and Green IT Best Practice; Auther : Jason Harris; PUBLISHER : Emereo; SIZE : 1mb");
                    down(add);
                }
                else {
                    gc2des.setVisibility(View.VISIBLE);
                    gc2t.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        oopd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem2 oops Balagurusamy-ObjectOrientedProgrammingWithC++.pdf";
                    oopt.setText("SUBJECT : Object Oriented Programming; TITLE : Object Oriented Programming with C++; Auther : E. Balagurusamy; PUBLISHER : TMH;  EDITION : 4th; SIZE : 20mb");
                    down(add);
                }
                else {
                    oopdes.setVisibility(View.VISIBLE);
                    oopt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        wdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem2 WDThomas A. Powell - Web Design Complete Reference.pdf";
                    wdt.setText("SUBJECT : Web Programming; TITLE : Web Design The Complete Reference; Auther : Thomas Powell; PUBLISHER : TMH; SIZE : 24mb");
                    down(add);
                }
                else {
                    wddes.setVisibility(View.VISIBLE);
                    wdt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        nsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/sem2S.S.Sastry-IntroductoryMethodsOfNumerical analysis.pdf";
                    nst.setText("SUBJECT : Numerical and Statistical Methods; TITLE : Introductory Methods of Numerical Methods; Auther : S. S. Shastri; PUBLISHER : PHI;  EDITION : 5th; SIZE : 3mb");
                    down(add);
                }
                else {
                    nsdes.setVisibility(View.VISIBLE);
                    nst.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        cnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem3CNData Communications & Networking.pdf";
                    cnt.setText("SUBJECT : Computer Networks; TITLE : Data Communication and Networking; Auther : Behrouz A. Forouzan; PUBLISHER : TMH;  EDITION : 4th; SIZE : 11mb");
                    down(add);
                }
                else {
                    cndes.setVisibility(View.VISIBLE);
                    cnt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        ppd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem3PP Allen B. Downey - Think Python .pdf";
                    ppt.setText("SUBJECT :Python Programming; TITLE : Think Python; Auther : Allen Downey; PUBLISHER : O’Reilly; SIZE : 7mb");
                    down(add);
                }
                else {
                    ppdes.setVisibility(View.VISIBLE);
                    ppt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        cgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem4CGDonald D. Hearn, Pauline Baker - Computer graphics.pdf";
                    cgt.setText("SUBJECT : Computer Graphics and Animation; TITLE : Computer Graphics; Auther : Hearn, Baker; PUBLISHER : Pearson;  EDITION : 4th; SIZE : 24mb");
                    down(add);
                }
                else {
                    cgdes.setVisibility(View.VISIBLE);
                    cgt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        esd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem4ES K. Shibu-Introduction To Embedded Systems-Tmh (2009).pdf";
                    est.setText("SUBJECT : Introduction to Embedded Systems; TITLE : Introduction to embedded systems; Auther : Shibu K V; PUBLISHER : TMH;  EDITION : 1th; SIZE : 36mb");
                    down(add);
                }
                else {
                    esdes.setVisibility(View.VISIBLE);
                    est.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        cjd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem4JavaSchildt, Herbert Java The Complete Reference.pdf";
                    cjt.setText("SUBJECT : Core Java; TITLE : Java: The Complete Reference; Auther : Herbert Schildt; PUBLISHER : TMH;  EDITION : 9th; SIZE : 18mb");
                    down(add);
                }
                else {
                    cjdes.setVisibility(View.VISIBLE);
                    cjt.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });

        sed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean stat = conn();
                if(stat) {
                    String add ="http://khanimran.in/file/Sem4SEIan Sommerville-Software Engineering.pdf";
                    set.setText("SUBJECT : Software Engineering; TITLE : Software Engineering, edition,; Auther : Ian Somerville; PUBLISHER : Pearson;  EDITION : 9th; SIZE : 5mb");
                    down(add);
                }
                else {
                    sedes.setVisibility(View.VISIBLE);
                    set.setText("404 error: File Not Found\nCheck Your Internet Connection");
                }
            }
        });


    }

    public boolean conn(){
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getActiveNetworkInfo() != null){
            if(connectivityManager.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI ||
            connectivityManager.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_MOBILE)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public void down (String add){
        downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(add);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        Toast.makeText(Books.this, "Downloading...", Toast.LENGTH_LONG).show();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }
}
