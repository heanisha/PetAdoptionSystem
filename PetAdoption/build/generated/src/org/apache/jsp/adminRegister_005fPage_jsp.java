package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminRegister_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pet Adoption</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/icon.png\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background {\n");
      out.write("         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);\n");
      out.write("       \n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#a1ff52\">\n");
      out.write("        \n");
      out.write("         ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark text-white\" style=\"background-color:#1c1d1b\">\n");
      out.write("    <a class=\"navbar-brand text-muted\" href=\"main_loginPage.jsp\"></i>PET ADOPTION</a>\n");
      out.write("<!--    <a style=\"text-align:right\" class=\"navbar-brand text-muted\" href=\"main_loginPage.jsp\"></i>PET ADOPTION</a>-->\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          \n");
      out.write("      </li>\n");
      out.write("          \n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <main class=\"primary-background banner-background\" style=\"padding-botton:50px; height:700px; \" >\n");
      out.write("            <div class=\"container\"  >\n");
      out.write("                  <br>  <br>\n");
      out.write("               <div class=\"col-md-6 offset-md-3 \"  > \n");
      out.write("                   <div class=\"card text-white\"  style=\"background-color:#1c1d1b; margin-top:35px;\">\n");
      out.write("                       <div class=\"card-header text-center  text-white\" style=\"background-color:purple;\" >\n");
      out.write("                           <span class=\"fa fa-3x fa-user-circle text-white\"></span>\n");
      out.write("                           <br>\n");
      out.write("                           Register Here\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                       </div> \n");
      out.write("                       \n");
      out.write("                       <div class=\"card-body\">\n");
      out.write("                        <form id=\"reg-form\" action=\"AdminRegisterServlet\" method=\"POST\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"admin_id\">Admin ID</label>\n");
      out.write("    <input name=\"adminId\" required type=\"text\" text-white class=\"form-control\" id=\"admin_id\" aria-describedby=\"emailHelp\" placeholder=\"E.g AD001\">\n");
      out.write("  </div>\n");
      out.write("                                   \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write(" <div class=\"form-group\">\n");
      out.write("    <label for=\"admin_Name\">Admin Name</label>\n");
      out.write("    <input name=\"adminName\" required type=\"text\" class=\"form-control\" id=\"admin_name\" aria-describedby=\"emailHelp\" placeholder=\"Enter Name\">\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write(" <div class=\"form-group\">\n");
      out.write("    <label for=\"admin_Email\">Admin Email</label>\n");
      out.write("    <input name=\"adminEmail\"   required type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter Email\">\n");
      out.write("  </div>\n");
      out.write("          \n");
      out.write(" <div class=\"form-group\">\n");
      out.write("    <label for=\"admin_PhoneNo\">Admin Phone No</label>\n");
      out.write("    <input name=\"adminPhoneNo\"   required type=\"text\" class=\"form-control\" id=\"phone no\" placeholder=\"Enter Phone No\">\n");
      out.write("  </div>\n");
      out.write("                            \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("    <input name=\"adminPassword\"   required type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter Password\">\n");
      out.write("  </div>\n");
      out.write("                            \n");
      out.write("                                           \n");
      out.write("  <div class=\"form-check\">\n");
      out.write("    <input name=\"check\" type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("    <label class=\"form-check-label\" for=\"exampleCheck1\">Agree Terms and Conditions</label>\n");
      out.write("  </div>\n");
      out.write("                            \n");
      out.write("                            <br>    \n");
      out.write("                            <div class=\"container text-center\" id=\"loader\" style=\"display: none;\">\n");
      out.write("                            <span class=\"fa fa-repeat fa-spin fa-3x\"></span>\n");
      out.write("                            <h4>please wait</h4><!-- comment -->\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"container text-center text-center\">\n");
      out.write("                            <button id=\"submit-btn\" type=\"submit\" class=\"btn btn-primary  text-muted\" style=\"align-items:center; background-color:white\">SIGN UP</button>\n");
      out.write("                             </div>\n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("</form>   \n");
      out.write("                           \n");
      out.write("                       </div>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                   </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("  integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        console.log(\"loaded.......\");\n");
      out.write("        \n");
      out.write("        $('#reg-form').on('submit', function(event){\n");
      out.write("           event.preventDefault();\n");
      out.write("           \n");
      out.write("           let form=new FormData(this);\n");
      out.write("           \n");
      out.write("           $(\"#submit-btn\").show();\n");
      out.write("           $(\"#loader\").hide();\n");
      out.write("           //send register servlet\n");
      out.write("            $.ajax({\n");
      out.write("               url:\"AdminRegisterServlet\",\n");
      out.write("               type:'POST',\n");
      out.write("               data:form,\n");
      out.write("               success:function (data,textStatus,jqXHR) {\n");
      out.write("                 console.log(data);\n");
      out.write("                 \n");
      out.write("           $(\"#submit-btn\").show();\n");
      out.write("           $(\"#loader\").hide();\n");
      out.write("           \n");
      out.write("           if(data.trim()==='done')\n");
      out.write("           {\n");
      out.write("               \n");
      out.write("     swal(\"You have Sign Up SUCESSFULLY\").then((value) => {\n");
      out.write(" window.location=\"adminLogin_page.jsp\";\n");
      out.write("});\n");
      out.write("\n");
      out.write("           }else{\n");
      out.write("               \n");
      out.write("                 swal(data);\n");
      out.write("           }\n");
      out.write("               },\n");
      out.write("               error: function(jqXHR, textStatus, errorThrown) {\n");
      out.write("                   $(\"#submit-btn\").show();\n");
      out.write("                   $(\"#loader\").hide();\n");
      out.write("                  swal(\"Something wrong. Try again\");\n");
      out.write("\n");
      out.write("               },\n");
      out.write("               processData:false,\n");
      out.write("               contentType: false\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
