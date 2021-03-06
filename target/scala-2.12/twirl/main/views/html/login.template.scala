
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
    """),_display_(/*5.6*/main("Login")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
        """),format.raw/*6.9*/("""<!--HTML content for the index view -->
        <div class="col-xs-4">
            <h3>Sign in</h3>
            <!-- Display login errors if they exist -->
            """),_display_(/*10.14*/if(loginForm.hasGlobalErrors)/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
                """),format.raw/*11.17*/("""<p class="alert alert-warning">
                    """),_display_(/*12.22*/loginForm/*12.31*/.globalError.message),format.raw/*12.51*/("""
                """),format.raw/*13.17*/("""</p>
            """)))}),format.raw/*14.14*/("""
            """),_display_(/*15.14*/if(flash.containsKey("error"))/*15.44*/ {_display_(Seq[Any](format.raw/*15.46*/("""
                """),format.raw/*16.17*/("""<p class="alert alert-warning">
                    """),_display_(/*17.22*/flash/*17.27*/.get("loginRequired")),format.raw/*17.48*/("""
                """),format.raw/*18.17*/("""</p>
             """)))}),format.raw/*19.15*/("""
    """),format.raw/*20.5*/("""<!-- The login form -->
            """),_display_(/*21.14*/helper/*21.20*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.84*/ {_display_(Seq[Any](format.raw/*21.86*/("""
             """),format.raw/*22.42*/("""
             """),format.raw/*23.103*/("""
             """),format.raw/*37.27*/("""
        """),format.raw/*38.9*/("""</div>
        <!-- End of content for main -->
""")))}),format.raw/*40.2*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 16:39:59 IST 2018
                  SOURCE: /home/wdd/Downloads/Project-master/app/views/login.scala.html
                  HASH: eff2e9ce45239a60fb86dcc8959d1d8897232716
                  MATRIX: 966->1|1076->40|1121->38|1148->56|1176->129|1207->135|1228->148|1267->150|1302->159|1498->328|1536->357|1576->359|1621->376|1701->429|1719->438|1760->458|1805->475|1854->493|1895->507|1934->537|1974->539|2019->556|2099->609|2113->614|2155->635|2200->652|2250->671|2282->676|2346->713|2361->719|2434->783|2474->785|2516->827|2559->930|2601->1521|2637->1530|2716->1579
                  LINES: 28->1|31->2|34->1|35->3|36->4|37->5|37->5|37->5|38->6|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|53->21|53->21|53->21|53->21|54->22|55->23|56->37|57->38|59->40
                  -- GENERATED --
              */
          