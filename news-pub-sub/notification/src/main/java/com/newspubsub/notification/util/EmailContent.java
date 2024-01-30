package com.newspubsub.notification.util;

public class EmailContent {
    public static final String HTML = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
            "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" lang=\"en\">\n" +
            " <head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n" +
            "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
            "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "  <meta content=\"telephone=no\" name=\"format-detection\">\n" +
            "  <title>Empty template</title><!--[if (mso 16)]>\n" +
            "    <style type=\"text/css\">\n" +
            "    a {text-decoration: none;}\n" +
            "    </style>\n" +
            "    <![endif]--><!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--><!--[if gte mso 9]>\n" +
            "<xml>\n" +
            "    <o:OfficeDocumentSettings>\n" +
            "    <o:AllowPNG></o:AllowPNG>\n" +
            "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
            "    </o:OfficeDocumentSettings>\n" +
            "</xml>\n" +
            "<![endif]--><!--[if !mso]><!-- -->\n" +
            "  <link href=\"https://fonts.googleapis.com/css?family=Merriweather:400,400i,700,700i\" rel=\"stylesheet\">\n" +
            "  <link href=\"https://fonts.googleapis.com/css?family=Merriweather+Sans:400,400i,700,700i\" rel=\"stylesheet\"><!--<![endif]-->\n" +
            "  <style type=\"text/css\">\n" +
            "#outlook a {\n" +
            "\tpadding:0;\n" +
            "}\n" +
            ".es-button {\n" +
            "\tmso-style-priority:100!important;\n" +
            "\ttext-decoration:none!important;\n" +
            "}\n" +
            "a[x-apple-data-detectors] {\n" +
            "\tcolor:inherit!important;\n" +
            "\ttext-decoration:none!important;\n" +
            "\tfont-size:inherit!important;\n" +
            "\tfont-family:inherit!important;\n" +
            "\tfont-weight:inherit!important;\n" +
            "\tline-height:inherit!important;\n" +
            "}\n" +
            ".es-desk-hidden {\n" +
            "\tdisplay:none;\n" +
            "\tfloat:left;\n" +
            "\toverflow:hidden;\n" +
            "\twidth:0;\n" +
            "\tmax-height:0;\n" +
            "\tline-height:0;\n" +
            "\tmso-hide:all;\n" +
            "}\n" +
            "@media only screen and (max-width:600px) {p, ul li, ol li, a { line-height:150%!important } h1, h2, h3, h1 a, h2 a, h3 a { line-height:120%!important } h1 { font-size:30px!important; text-align:left } h2 { font-size:24px!important; text-align:left } h3 { font-size:20px!important; text-align:left } .es-header-body h1 a, .es-content-body h1 a, .es-footer-body h1 a { font-size:30px!important; text-align:left } .es-header-body h2 a, .es-content-body h2 a, .es-footer-body h2 a { font-size:24px!important; text-align:left } .es-header-body h3 a, .es-content-body h3 a, .es-footer-body h3 a { font-size:20px!important; text-align:left } .es-menu td a { font-size:14px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:14px!important } .es-content-body p, .es-content-body ul li, .es-content-body ol li, .es-content-body a { font-size:14px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:14px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:inline-block!important } a.es-button, button.es-button { font-size:18px!important; display:inline-block!important } .es-adaptive table, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0!important } .es-m-p0r { padding-right:0!important } .es-m-p0l { padding-left:0!important } .es-m-p0t { padding-top:0!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } tr.es-desk-hidden, td.es-desk-hidden, table.es-desk-hidden { width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } tr.es-desk-hidden { display:table-row!important } table.es-desk-hidden { display:table!important } td.es-desk-menu-hidden { display:table-cell!important } .es-menu td { width:1%!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; max-height:inherit!important } .es-m-p5 { padding:5px!important } .es-m-p5t { padding-top:5px!important } .es-m-p5b { padding-bottom:5px!important } .es-m-p5r { padding-right:5px!important } .es-m-p5l { padding-left:5px!important } .es-m-p10 { padding:10px!important } .es-m-p10t { padding-top:10px!important } .es-m-p10b { padding-bottom:10px!important } .es-m-p10r { padding-right:10px!important } .es-m-p10l { padding-left:10px!important } .es-m-p15 { padding:15px!important } .es-m-p15t { padding-top:15px!important } .es-m-p15b { padding-bottom:15px!important } .es-m-p15r { padding-right:15px!important } .es-m-p15l { padding-left:15px!important } .es-m-p20 { padding:20px!important } .es-m-p20t { padding-top:20px!important } .es-m-p20r { padding-right:20px!important } .es-m-p20l { padding-left:20px!important } .es-m-p25 { padding:25px!important } .es-m-p25t { padding-top:25px!important } .es-m-p25b { padding-bottom:25px!important } .es-m-p25r { padding-right:25px!important } .es-m-p25l { padding-left:25px!important } .es-m-p30 { padding:30px!important } .es-m-p30t { padding-top:30px!important } .es-m-p30b { padding-bottom:30px!important } .es-m-p30r { padding-right:30px!important } .es-m-p30l { padding-left:30px!important } .es-m-p35 { padding:35px!important } .es-m-p35t { padding-top:35px!important } .es-m-p35b { padding-bottom:35px!important } .es-m-p35r { padding-right:35px!important } .es-m-p35l { padding-left:35px!important } .es-m-p40 { padding:40px!important } .es-m-p40t { padding-top:40px!important } .es-m-p40b { padding-bottom:40px!important } .es-m-p40r { padding-right:40px!important } .es-m-p40l { padding-left:40px!important } }\n" +
            "@media screen and (max-width:384px) {.mail-message-content { width:414px!important } }\n" +
            "</style>\n" +
            " </head>\n" +
            " <body style=\"width:100%;font-family:arial, 'helvetica neue', helvetica, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0\">\n" +
            "  <div dir=\"ltr\" class=\"es-wrapper-color\" lang=\"en\" style=\"background-color:#F6F6F6\"><!--[if gte mso 9]>\n" +
            "\t\t\t<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\n" +
            "\t\t\t\t<v:fill type=\"tile\" color=\"#f6f6f6\"></v:fill>\n" +
            "\t\t\t</v:background>\n" +
            "\t\t<![endif]-->\n" +
            "   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;background-color:#F6F6F6\">\n" +
            "     <tr>\n" +
            "      <td valign=\"top\" style=\"padding:0;Margin:0\">\n" +
            "       <table class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top\">\n" +
            "         <tr>\n" +
            "          <td align=\"center\" style=\"padding:0;Margin:0\">\n" +
            "           <table class=\"es-header-body\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\">\n" +
            "             <tr>\n" +
            "              <td align=\"left\" style=\"padding:0;Margin:0;padding-top:20px;padding-left:20px;padding-right:20px\">\n" +
            "               <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                 <tr>\n" +
            "                  <td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;width:560px\">\n" +
            "                   <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;display:none\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table></td>\n" +
            "             </tr>\n" +
            "           </table></td>\n" +
            "         </tr>\n" +
            "       </table>\n" +
            "       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\">\n" +
            "         <tr>\n" +
            "          <td align=\"center\" style=\"padding:0;Margin:0\">\n" +
            "           <table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\">\n" +
            "             <tr>\n" +
            "              <td align=\"left\" style=\"padding:0;Margin:0;padding-top:20px;padding-left:20px;padding-right:20px\">\n" +
            "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                 <tr>\n" +
            "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"left\" style=\"padding:0;Margin:0\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;color:#333333;font-size:14px\"><strong>Lorem Ipsum</strong> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;color:#333333;font-size:14px\"><br></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;color:#333333;font-size:14px;display:none\"><br></p></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table></td>\n" +
            "             </tr>\n" +
            "           </table></td>\n" +
            "         </tr>\n" +
            "       </table>\n" +
            "       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-content\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\">\n" +
            "         <tr>\n" +
            "          <td align=\"center\" style=\"padding:0;Margin:0\">\n" +
            "           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#333333;width:600px\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#333333\" align=\"center\" role=\"none\">\n" +
            "             <tr>\n" +
            "              <td style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;background-color:#333333\" bgcolor=\"#333333\" align=\"left\"><!--[if mso]><table style=\"width:560px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:270px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\">\n" +
            "                 <tr>\n" +
            "                  <td align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#ffffff\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/CABINET_b2094cafdd779c25046fb07f9b3b29ed/images/27111557918951268.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"270\" height=\"275\"></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-left:15px;padding-right:15px\"><h5 style=\"Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;color:#3d85c6\" class=\"brand\">BLOUSES</h5></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:15px;padding-right:15px\"><h3 class=\"product-name\" style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333\">Bow Sleeve Woven Blouse</h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td esdev-links-color=\"#ffffff\" class=\"es-m-txt-c\" width=\"50%\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px;padding-left:15px;padding-right:15px\"><h3 style=\"Margin:0;line-height:33px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:18px;font-style:normal;font-weight:normal;color:#999999\"><s class=\"old-price\" style=\"text-decoration:line-through\">200$</s>&nbsp;<strong><span style=\"color:#333333;font-size:22px\" class=\"price\">160$</span></strong></h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td height=\"20\" bgcolor=\"#333333\" align=\"center\" style=\"padding:0;Margin:0\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "                 <tr>\n" +
            "                  <td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#ffffff\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px;font-size:0px\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/CABINET_b2094cafdd779c25046fb07f9b3b29ed/images/41021557919686343.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"270\" height=\"207\"></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-left:15px;padding-right:15px\"><h5 style=\"Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;color:#3d85c6\" class=\"brand\">BLOUSES</h5></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:15px;padding-right:15px\"><h3 class=\"product-name\" style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333\">Bow Sleeve Woven Blouse</h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td esdev-links-color=\"#ffffff\" class=\"es-m-txt-c\" width=\"50%\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px;padding-left:15px;padding-right:15px\"><h3 style=\"Margin:0;line-height:33px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:18px;font-style:normal;font-weight:normal;color:#999999\"><s class=\"old-price\" style=\"text-decoration:line-through\">200$</s>&nbsp;<strong><span style=\"color:#333333;font-size:22px\" class=\"price\">130$</span></strong></h3></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td><td style=\"width:20px\"></td><td style=\"width:270px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\">\n" +
            "                 <tr>\n" +
            "                  <td align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#ffffff\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/CABINET_b2094cafdd779c25046fb07f9b3b29ed/images/55471557916309573.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"270\" height=\"207\"></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-left:15px;padding-right:15px\"><h5 style=\"Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;color:#3d85c6\" class=\"brand\">BLOUSES</h5></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:15px;padding-right:15px\"><h3 class=\"product-name\" style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333\">Angel Sleeve Blouse</h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td esdev-links-color=\"#ffffff\" class=\"es-m-txt-c\" width=\"50%\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px;padding-left:15px;padding-right:15px\"><h3 style=\"Margin:0;line-height:33px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:18px;font-style:normal;font-weight:normal;color:#999999\"><s class=\"old-price\" style=\"text-decoration:line-through\">290$</s>&nbsp;<strong><span style=\"color:#333333;font-size:22px\" class=\"price\">205$</span></strong></h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td height=\"20\" bgcolor=\"#333333\" align=\"center\" style=\"padding:0;Margin:0\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "                 <tr>\n" +
            "                  <td align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#ffffff\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/CABINET_b2094cafdd779c25046fb07f9b3b29ed/images/27121557919686389.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"270\" height=\"207\"></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-left:15px;padding-right:15px\"><h5 style=\"Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;color:#3d85c6\" class=\"brand\">BLOUSES</h5></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:15px;padding-right:15px\"><h3 class=\"product-name\" style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333\">Angel Sleeve Blouse</h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td esdev-links-color=\"#ffffff\" class=\"es-m-txt-c\" width=\"50%\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px;padding-left:15px;padding-right:15px\"><h3 style=\"Margin:0;line-height:33px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:18px;font-style:normal;font-weight:normal;color:#999999\"><s class=\"old-price\" style=\"text-decoration:line-through\">160$</s><strong><span style=\"color:#333333;font-size:22px\" class=\"price\">90$</span></strong></h3></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td></tr></table><![endif]--></td>\n" +
            "             </tr>\n" +
            "           </table></td>\n" +
            "         </tr>\n" +
            "       </table>\n" +
            "       <table class=\"es-footer\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top\">\n" +
            "         <tr>\n" +
            "          <td align=\"center\" style=\"padding:0;Margin:0\">\n" +
            "           <table class=\"es-footer-body\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\">\n" +
            "             <tr>\n" +
            "              <td style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:40px;padding-bottom:40px;background-color:#182838\" bgcolor=\"#182838\" align=\"left\">\n" +
            "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                 <tr>\n" +
            "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:10px;padding-left:20px;padding-right:20px\"><h1 style=\"Margin:0;line-height:30px;mso-line-height-rule:exactly;font-family:'merriweather sans', 'helvetica neue', helvetica, arial, sans-serif;font-size:30px;font-style:normal;font-weight:normal;color:#ffffff\"><strong>Sales</strong></h1></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-left:20px;padding-right:20px\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#ffffff\">Food, Beverage and Household</h3></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"Margin:0;padding-top:20px;padding-left:20px;padding-right:20px;padding-bottom:30px\"><a target=\"_blank\" href=\"https://www.starbucks.com/\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:underline;color:#2CB543;font-size:14px\"><img class=\"adapt-img\" alt src=\"https://cdt-timer.stripocdn.email/api/v1/images/2_abbamj9A_d4C-r9a5kRoy_5FuouyTyzzr0r11_eTQ?l=1703836108764\" width=\"520\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></a></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:10px;Margin:0\"><!--[if mso]><a href=\"https://www.starbucks.com/\" target=\"_blank\" hidden>\n" +
            "\t<v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" esdevVmlButton href=\"https://www.starbucks.com/\" \n" +
            "                style=\"height:39px; v-text-anchor:middle; width:146px\" arcsize=\"50%\" strokecolor=\"#2cb543\" strokeweight=\"2px\" fillcolor=\"#ffffff\">\n" +
            "\t\t<w:anchorlock></w:anchorlock>\n" +
            "\t\t<center style='color:#333333; font-family:arial, \"helvetica neue\", helvetica, sans-serif; font-size:14px; font-weight:400; line-height:14px;  mso-text-raise:1px'>Shop Now</center>\n" +
            "\t</v:roundrect></a>\n" +
            "<![endif]--><!--[if !mso]><!-- --><span class=\"msohide es-button-border\" style=\"border-style:solid;border-color:#2CB543;background:#ffffff;border-width:0px 0px 2px 0px;display:inline-block;border-radius:30px;width:auto;mso-hide:all\"><a href=\"https://www.starbucks.com/\" class=\"es-button\" target=\"_blank\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;color:#333333;font-size:18px;display:inline-block;background:none 0% 0% repeat scroll #ffffff;border-radius:30px;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-weight:normal;font-style:normal;line-height:22px;width:auto;text-align:center;padding:10px 20px 10px 20px;mso-padding-alt:0;mso-border-alt:10px solid none 0% 0% repeat scroll #ffffff\">Shop Now</a></span><!--<![endif]--></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table></td>\n" +
            "             </tr>\n" +
            "             <tr>\n" +
            "              <td align=\"left\" style=\"padding:0;Margin:0\"><!--[if mso]><table style=\"width:600px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:360px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\">\n" +
            "                 <tr>\n" +
            "                  <td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:360px\">\n" +
            "                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-position:center top\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\">\n" +
            "                     <tr>\n" +
            "                      <td style=\"padding:0;Margin:0;position:relative\" align=\"center\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/bannerImgGuid/images/27721559549472970.png\" alt title style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"360\" height=\"360\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td><td style=\"width:240px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\">\n" +
            "                 <tr>\n" +
            "                  <td align=\"left\" style=\"padding:0;Margin:0;width:240px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td style=\"padding:0;Margin:0;position:relative\" align=\"center\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/bannerImgGuid/images/20151617623026714.png\" alt title width=\"240\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" height=\"359\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td></tr></table><![endif]--></td>\n" +
            "             </tr>\n" +
            "             <tr>\n" +
            "              <td style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;background-color:#a2c4c9\" align=\"left\" bgcolor=\"#a2c4c9\"><!--[if mso]><table dir=\"rtl\" style=\"width:560px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td dir=\"ltr\" style=\"width:225px\" valign=\"top\"><![endif]-->\n" +
            "               <table cellspacing=\"0\" cellpadding=\"0\" align=\"right\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                 <tr>\n" +
            "                  <td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:225px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:10px;Margin:0\"><h1 class=\"b_title\" style=\"Margin:0;line-height:45px;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:30px;font-style:normal;font-weight:normal;color:#ffffff\">Hurry, Take 10% off your first order</h1></td>\n" +
            "                     </tr>\n" +
            "                     <tr>\n" +
            "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:10px\"><p class=\"b_description\" style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:18px;color:#ffffff;font-size:12px\">Lorem Ipsum dolor sit amet, volutpat gubergren.</p></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td><td dir=\"ltr\" style=\"width:20px\"></td><td dir=\"ltr\" style=\"width:315px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\">\n" +
            "                 <tr>\n" +
            "                  <td class=\"es-m-p0r\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:315px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td align=\"left\" style=\"padding:0;Margin:0\"><img class=\"adapt-img\" src=\"https://ebgcspy.stripocdn.email/content/guids/CABINET_a4de511e085fc699b9cccdbe805f5474/images/72741557996658358.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"315\" height=\"210\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td></tr></table><![endif]--></td>\n" +
            "             </tr>\n" +
            "             <tr>\n" +
            "              <td style=\"Margin:0;padding-top:15px;padding-bottom:15px;padding-left:20px;padding-right:20px;background-color:#efefef\" bgcolor=\"#efefef\" align=\"left\"><!--[if mso]><table style=\"width:560px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:270px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\">\n" +
            "                 <tr>\n" +
            "                  <td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td class=\"es-m-txt-c\" align=\"left\" style=\"padding:0;Margin:0\"><img src=\"https://ebgcspy.stripocdn.email/content/guids/CABINET_ff06f0f6afff91e4506ef568b46158c8/images/9971551871821025.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"168\" height=\"27\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td><td style=\"width:20px\"></td><td style=\"width:270px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\">\n" +
            "                 <tr>\n" +
            "                  <td align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td class=\"es-m-txt-c\" align=\"right\" style=\"padding:0;Margin:0\">\n" +
            "                       <table class=\"es-table-not-adapt es-social\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                         <tr>\n" +
            "                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px\"><img title=\"Facebook\" src=\"https://ebgcspy.stripocdn.email/content/assets/img/social-icons/logo-black/facebook-logo-black.png\" alt=\"Fb\" width=\"32\" height=\"32\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></td>\n" +
            "                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px\"><img title=\"Twitter\" src=\"https://ebgcspy.stripocdn.email/content/assets/img/social-icons/logo-black/twitter-logo-black.png\" alt=\"Tw\" width=\"32\" height=\"32\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></td>\n" +
            "                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px\"><img title=\"Instagram\" src=\"https://ebgcspy.stripocdn.email/content/assets/img/social-icons/logo-black/instagram-logo-black.png\" alt=\"Inst\" width=\"32\" height=\"32\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></td>\n" +
            "                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0\"><img title=\"Youtube\" src=\"https://ebgcspy.stripocdn.email/content/assets/img/social-icons/logo-black/youtube-logo-black.png\" alt=\"Yt\" width=\"32\" height=\"32\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></td>\n" +
            "                         </tr>\n" +
            "                       </table></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td></tr></table><![endif]--></td>\n" +
            "             </tr>\n" +
            "             <tr>\n" +
            "              <td align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px\"><!--[if mso]><table style=\"width:560px\" cellpadding=\"0\" \n" +
            "                        cellspacing=\"0\"><tr><td style=\"width:270px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\">\n" +
            "                 <tr>\n" +
            "                  <td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td style=\"padding:0;Margin:0;display:none\" align=\"center\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td><td style=\"width:20px\"></td><td style=\"width:270px\" valign=\"top\"><![endif]-->\n" +
            "               <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\">\n" +
            "                 <tr>\n" +
            "                  <td align=\"left\" style=\"padding:0;Margin:0;width:270px\">\n" +
            "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\">\n" +
            "                     <tr>\n" +
            "                      <td style=\"padding:0;Margin:0;display:none\" align=\"center\"></td>\n" +
            "                     </tr>\n" +
            "                   </table></td>\n" +
            "                 </tr>\n" +
            "               </table><!--[if mso]></td></tr></table><![endif]--></td>\n" +
            "             </tr>\n" +
            "           </table></td>\n" +
            "         </tr>\n" +
            "       </table></td>\n" +
            "     </tr>\n" +
            "   </table>\n" +
            "  </div>\n" +
            " </body>\n" +
            "</html>";
}
