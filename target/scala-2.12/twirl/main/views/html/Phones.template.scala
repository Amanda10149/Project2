
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

object Phones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.49*/routes/*8.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*8.100*/("""">
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
		
		
	</head>

	<body>
	
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

   <!-- Wrapper for slides -->
    <div class="carousel-inner">
    <div class="item active">
      <img src="/assets/images/sale.jpg" alt="Sale">
    </div>
	

    <div class="item">
      <img src="/assets/images/tv.jpg" alt="TV">
    </div>

    <div class="item">
      <img src="/assets/images/iphone.png" alt="iPhone">
    </div>
	
	<div class="item">
      <img src="/assets/images/laptop.jpg" alt="Macbook">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<style>
.carousel-inner img """),format.raw/*62.21*/("""{"""),format.raw/*62.22*/("""
      
      """),format.raw/*64.7*/("""width: 50%; /* Set width to 100% */
      margin: auto;
	  height:50%;
  """),format.raw/*67.3*/("""}"""),format.raw/*67.4*/("""
  """),format.raw/*68.3*/("""</style>
    

				
				<ul id="navbar">
				<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/pc">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
					<li class="dropdown"><a href="/subscribe">Subscribe</a></li>
				</ul>
			</header>
			
			4<main>
				<div id="columns">
					<h2>Dell Laptops</h2>
					<div id="leftCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
                                    <img src="/assets/images/iphoneX.jpg" alt="IPHX" class="productImg">
                                    """),_display_(/*90.38*/for(p <-products) yield /*90.55*/ {_display_(Seq[Any](format.raw/*90.57*/("""
                                    """),_display_(/*91.38*/if(p.getId == 2)/*91.54*/ {_display_(Seq[Any](format.raw/*91.56*/("""
									"""),format.raw/*92.10*/("""<h4>"""),_display_(/*92.15*/p/*92.16*/.getName),format.raw/*92.24*/(""" """),format.raw/*92.25*/("""</h4>
									<ul>	
										<li>"""),_display_(/*94.16*/p/*94.17*/.getDescription),format.raw/*94.32*/("""</li><br>
										
										<li>"""),_display_(/*96.16*/p/*96.17*/.getStock),format.raw/*96.26*/("""</li><br>
										<li>"""),_display_(/*97.16*/p/*97.17*/.getPrice),format.raw/*97.26*/("""</li><br>
                    <li><a href="#" class="moreInfoBtn">Click for more info</a></li>
                                        """)))}),format.raw/*99.42*/("""   
                                    """),format.raw/*100.37*/("""</ul>
                                """)))}),format.raw/*101.34*/("""   
								"""),format.raw/*102.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/iphone6.jpg" alt="IPH6" class="productImg">
									"""),_display_(/*106.11*/for(p <-products) yield /*106.28*/ {_display_(Seq[Any](format.raw/*106.30*/("""
										"""),_display_(/*107.12*/if(p.getId == 5)/*107.28*/ {_display_(Seq[Any](format.raw/*107.30*/("""
									"""),format.raw/*108.10*/("""<h4>"""),_display_(/*108.15*/p/*108.16*/.getName),format.raw/*108.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*110.16*/p/*110.17*/.getDescription),format.raw/*110.32*/("""</li><br>
									
										<li>"""),_display_(/*112.16*/p/*112.17*/.getStock),format.raw/*112.26*/("""</li><br>
										<li>"""),_display_(/*113.16*/p/*113.17*/.getPrice),format.raw/*113.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*115.13*/("""
									"""),format.raw/*116.10*/("""</ul>
								""")))}),format.raw/*117.10*/("""
								"""),format.raw/*118.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
									<img src="/assets/images/iphone7.jpg" alt="IPH7" class="productImg">
									"""),_display_(/*129.11*/for(p <-products) yield /*129.28*/ {_display_(Seq[Any](format.raw/*129.30*/("""
										"""),_display_(/*130.12*/if(p.getId == 8)/*130.28*/ {_display_(Seq[Any](format.raw/*130.30*/("""
									"""),format.raw/*131.10*/("""<h4>"""),_display_(/*131.15*/p/*131.16*/.getName),format.raw/*131.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*133.16*/p/*133.17*/.getDescription),format.raw/*133.32*/("""  """),format.raw/*133.34*/("""</li><br>
										<li>"""),_display_(/*134.16*/p/*134.17*/.getStock),format.raw/*134.26*/("""</li><br>
										<li>"""),_display_(/*135.16*/p/*135.17*/.getPrice),format.raw/*135.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*137.13*/("""
									"""),format.raw/*138.10*/("""</ul>
								""")))}),format.raw/*139.10*/("""
								"""),format.raw/*140.9*/("""</div>
								</div>
							</div>
						</div>
					</div>
					
					<div id="bottomCol">
						<div class="outerColDiv">
							
						</div>
					</div>
				</div>
			</main>
			
			<footer>
				Copyright &copy; 2016 
			</footer>
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 16:01:40 IST 2018
                  SOURCE: /home/wdd/webapps/Project/app/views/Phones.scala.html
                  HASH: 9137b1ab1535833b39074f5c748dc653790a7dbc
                  MATRIX: 963->1|1090->33|1118->35|1256->147|1270->153|1336->198|3143->1977|3172->1978|3213->1992|3313->2065|3341->2066|3371->2069|4128->2799|4161->2816|4201->2818|4266->2856|4291->2872|4331->2874|4369->2884|4401->2889|4411->2890|4440->2898|4469->2899|4532->2935|4542->2936|4578->2951|4641->2987|4651->2988|4681->2997|4733->3022|4743->3023|4773->3032|4940->3168|5009->3208|5080->3247|5120->3259|5286->3397|5320->3414|5361->3416|5401->3428|5427->3444|5468->3446|5507->3456|5540->3461|5551->3462|5581->3470|5645->3506|5656->3507|5693->3522|5756->3557|5767->3558|5798->3567|5851->3592|5862->3593|5893->3602|6022->3699|6061->3709|6108->3724|6145->3733|6424->3984|6458->4001|6499->4003|6539->4015|6565->4031|6606->4033|6645->4043|6678->4048|6689->4049|6719->4057|6783->4093|6794->4094|6831->4109|6862->4111|6915->4136|6926->4137|6957->4146|7010->4171|7021->4172|7052->4181|7181->4278|7220->4288|7267->4303|7304->4312
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|94->62|94->62|96->64|99->67|99->67|100->68|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|124->92|124->92|126->94|126->94|126->94|128->96|128->96|128->96|129->97|129->97|129->97|131->99|132->100|133->101|134->102|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|142->110|142->110|142->110|144->112|144->112|144->112|145->113|145->113|145->113|147->115|148->116|149->117|150->118|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|163->131|163->131|165->133|165->133|165->133|165->133|166->134|166->134|166->134|167->135|167->135|167->135|169->137|170->138|171->139|172->140
                  -- GENERATED --
              */
          