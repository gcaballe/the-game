package com.kronostudios.the_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class TermsAndCond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_cond);
        TextView tv = findViewById(R.id.textViewTerms);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(Html.fromHtml("<h1>Terms and Conditions</h1>\n" +
                "<p>Last updated: February 20, 2022</p>\n" +
                "<p>Please read these terms and conditions carefully before using Our Service.</p>\n" +
                "<h1>Interpretation and Definitions</h1>\n" +
                "<h2>Interpretation</h2>\n" +
                "<p>The words of which the initial letter is capitalized have meanings defined under the following conditions. The following definitions shall have the same meaning regardless of whether they appear in singular or in plural.</p>\n" +
                "<h2>Definitions</h2>\n" +
                "<p>For the purposes of these Terms and Conditions:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><strong>Application</strong> means the software program provided by the Company downloaded by You on any electronic device, named UntitledCardGame</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Application Store</strong> means the digital distribution service operated and developed by Apple Inc. (Apple App Store) or Google Inc. (Google Play Store) in which the Application has been downloaded.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Affiliate</strong> means an entity that controls, is controlled by or is under common control with a party, where &quot;control&quot; means ownership of 50% or more of the shares, equity interest or other securities entitled to vote for election of directors or other managing authority.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Country</strong> refers to:  Spain</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Company</strong> (referred to as either &quot;the Company&quot;, &quot;We&quot;, &quot;Us&quot; or &quot;Our&quot; in this Agreement) refers to UntitledCardGame.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Device</strong> means any device that can access the Service such as a computer, a cellphone or a digital tablet.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Service</strong> refers to the Application.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Terms and Conditions</strong> (also referred as &quot;Terms&quot;) mean these Terms and Conditions that form the entire agreement between You and the Company regarding the use of the Service. This Terms and Conditions agreement has been created with the help of the <a href=\"https://www.termsfeed.com/terms-conditions-generator/\" target=\"_blank\">Terms and Conditions Generator</a>.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Third-party Social Media Service</strong> means any services or content (including data, information, products or services) provided by a third-party that may be displayed, included or made available by the Service.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>You</strong> means the individual accessing or using the Service, or the company, or other legal entity on behalf of which such individual is accessing or using the Service, as applicable.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h1>Acknowledgment</h1>\n" +
                "<p>These are the Terms and Conditions governing the use of this Service and the agreement that operates between You and the Company. These Terms and Conditions set out the rights and obligations of all users regarding the use of the Service.</p>\n" +
                "<p>Your access to and use of the Service is conditioned on Your acceptance of and compliance with these Terms and Conditions. These Terms and Conditions apply to all visitors, users and others who access or use the Service.</p>\n" +
                "<p>By accessing or using the Service You agree to be bound by these Terms and Conditions. If You disagree with any part of these Terms and Conditions then You may not access the Service.</p>\n" +
                "<p>You represent that you are over the age of 18. The Company does not permit those under 18 to use the Service.</p>\n" +
                "<p>Your access to and use of the Service is also conditioned on Your acceptance of and compliance with the Privacy Policy of the Company. Our Privacy Policy describes Our policies and procedures on the collection, use and disclosure of Your personal information when You use the Application or the Website and tells You about Your privacy rights and how the law protects You. Please read Our Privacy Policy carefully before using Our Service.</p>\n" +
                "<h1>Links to Other Websites</h1>\n" +
                "<p>Our Service may contain links to third-party web sites or services that are not owned or controlled by the Company.</p>\n" +
                "<p>The Company has no control over, and assumes no responsibility for, the content, privacy policies, or practices of any third party web sites or services. You further acknowledge and agree that the Company shall not be responsible or liable, directly or indirectly, for any damage or loss caused or alleged to be caused by or in connection with the use of or reliance on any such content, goods or services available on or through any such web sites or services.</p>\n" +
                "<p>We strongly advise You to read the terms and conditions and privacy policies of any third-party web sites or services that You visit.</p>\n" +
                "<h1>Termination</h1>\n" +
                "<p>We may terminate or suspend Your access immediately, without prior notice or liability, for any reason whatsoever, including without limitation if You breach these Terms and Conditions.</p>\n" +
                "<p>Upon termination, Your right to use the Service will cease immediately.</p>\n" +
                "<h1>Limitation of Liability</h1>\n" +
                "<p>Notwithstanding any damages that You might incur, the entire liability of the Company and any of its suppliers under any provision of this Terms and Your exclusive remedy for all of the foregoing shall be limited to the amount actually paid by You through the Service or 100 USD if You haven't purchased anything through the Service.</p>\n" +
                "<p>To the maximum extent permitted by applicable law, in no event shall the Company or its suppliers be liable for any special, incidental, indirect, or consequential damages whatsoever (including, but not limited to, damages for loss of profits, loss of data or other information, for business interruption, for personal injury, loss of privacy arising out of or in any way related to the use of or inability to use the Service, third-party software and/or third-party hardware used with the Service, or otherwise in connection with any provision of this Terms), even if the Company or any supplier has been advised of the possibility of such damages and even if the remedy fails of its essential purpose.</p>\n" +
                "<p>Some states do not allow the exclusion of implied warranties or limitation of liability for incidental or consequential damages, which means that some of the above limitations may not apply. In these states, each party's liability will be limited to the greatest extent permitted by law.</p>\n" +
                "<h1>&quot;AS IS&quot; and &quot;AS AVAILABLE&quot; Disclaimer</h1>\n" +
                "<p>The Service is provided to You &quot;AS IS&quot; and &quot;AS AVAILABLE&quot; and with all faults and defects without warranty of any kind. To the maximum extent permitted under applicable law, the Company, on its own behalf and on behalf of its Affiliates and its and their respective licensors and service providers, expressly disclaims all warranties, whether express, implied, statutory or otherwise, with respect to the Service, including all implied warranties of merchantability, fitness for a particular purpose, title and non-infringement, and warranties that may arise out of course of dealing, course of performance, usage or trade practice. Without limitation to the foregoing, the Company provides no warranty or undertaking, and makes no representation of any kind that the Service will meet Your requirements, achieve any intended results, be compatible or work with any other software, applications, systems or services, operate without interruption, meet any performance or reliability standards or be error free or that any errors or defects can or will be corrected.</p>\n" +
                "<p>Without limiting the foregoing, neither the Company nor any of the company's provider makes any representation or warranty of any kind, express or implied: (i) as to the operation or availability of the Service, or the information, content, and materials or products included thereon; (ii) that the Service will be uninterrupted or error-free; (iii) as to the accuracy, reliability, or currency of any information or content provided through the Service; or (iv) that the Service, its servers, the content, or e-mails sent from or on behalf of the Company are free of viruses, scripts, trojan horses, worms, malware, timebombs or other harmful components.</p>\n" +
                "<p>Some jurisdictions do not allow the exclusion of certain types of warranties or limitations on applicable statutory rights of a consumer, so some or all of the above exclusions and limitations may not apply to You. But in such a case the exclusions and limitations set forth in this section shall be applied to the greatest extent enforceable under applicable law.</p>\n" +
                "<h1>Governing Law</h1>\n" +
                "<p>The laws of the Country, excluding its conflicts of law rules, shall govern this Terms and Your use of the Service. Your use of the Application may also be subject to other local, state, national, or international laws.</p>\n" +
                "<h1>Disputes Resolution</h1>\n" +
                "<p>If You have any concern or dispute about the Service, You agree to first try to resolve the dispute informally by contacting the Company.</p>\n" +
                "<h1>For European Union (EU) Users</h1>\n" +
                "<p>If You are a European Union consumer, you will benefit from any mandatory provisions of the law of the country in which you are resident in.</p>\n" +
                "<h1>United States Legal Compliance</h1>\n" +
                "<p>You represent and warrant that (i) You are not located in a country that is subject to the United States government embargo, or that has been designated by the United States government as a &quot;terrorist supporting&quot; country, and (ii) You are not listed on any United States government list of prohibited or restricted parties.</p>\n" +
                "<h1>Severability and Waiver</h1>\n" +
                "<h2>Severability</h2>\n" +
                "<p>If any provision of these Terms is held to be unenforceable or invalid, such provision will be changed and interpreted to accomplish the objectives of such provision to the greatest extent possible under applicable law and the remaining provisions will continue in full force and effect.</p>\n" +
                "<h2>Waiver</h2>\n" +
                "<p>Except as provided herein, the failure to exercise a right or to require performance of an obligation under these Terms shall not effect a party's ability to exercise such right or require such performance at any time thereafter nor shall the waiver of a breach constitute a waiver of any subsequent breach.</p>\n" +
                "<h1>Translation Interpretation</h1>\n" +
                "<p>These Terms and Conditions may have been translated if We have made them available to You on our Service.\n" +
                "You agree that the original English text shall prevail in the case of a dispute.</p>\n" +
                "<h1>Changes to These Terms and Conditions</h1>\n" +
                "<p>We reserve the right, at Our sole discretion, to modify or replace these Terms at any time. If a revision is material We will make reasonable efforts to provide at least 30 days' notice prior to any new terms taking effect. What constitutes a material change will be determined at Our sole discretion.</p>\n" +
                "<p>By continuing to access or use Our Service after those revisions become effective, You agree to be bound by the revised terms. If You do not agree to the new terms, in whole or in part, please stop using the website and the Service.</p>\n" +
                "<h1>Contact Us</h1>\n" +
                "<p>If you have any questions about these Terms and Conditions, You can contact us:</p>\n" +
                "<ul>\n" +
                "<li>By email: markusmou51@gmail.com</li>\n" +
                "</ul>"));
    }
}