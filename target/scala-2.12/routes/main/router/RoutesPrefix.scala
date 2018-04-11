
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Project/conf/routes
// @DATE:Wed Apr 11 16:01:40 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
