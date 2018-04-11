
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Downloads/Project-master/conf/routes
// @DATE:Wed Apr 11 16:29:53 IST 2018


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
