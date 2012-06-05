package org.adehaus.osgi_scala.rest

import javax.ws.rs.{GET, QueryParam, Path}
import reflect.BeanProperty
import org.adehaus.osgi_scala.dict.Dict


@Path("/dictionary")
class RestfulDictionary {

  @BeanProperty var dictionary: Dict = _

  @GET
  @Path("check")
  def check(@QueryParam("word") word: String): Boolean = {
    dictionary.checkWord(word)
  }


}
