package com.wutsi.platform.msm

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-sms-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-sms-server-prod.herokuapp.com"),
  ;
}
