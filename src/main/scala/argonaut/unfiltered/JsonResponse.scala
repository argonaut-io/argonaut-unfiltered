package argonaut.unfiltered

import unfiltered.response._

import argonaut._, Argonaut._

object JsonResponse {
  def apply[A: EncodeJson](a: A, params: PrettyParams = PrettyParams.nospace) =
    JsonContent ~> ResponseString(a.jencode.pretty(params))
}
