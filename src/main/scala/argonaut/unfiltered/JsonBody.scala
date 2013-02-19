package argonaut
package unfiltered

import Argonaut._

object JsonBody {
  /**
   * See argonaut.ParseWrap for API details.
   */
  def apply[T](r: HttpRequest[T]) =
    new ParseWrap(r, new Parse[HttpRequest[T]] {
      JsonParser.parse(Body.string(r))
    })
}
