package com.wutsi.platform.msm.dto

import kotlin.String

public data class SendMessageRequest(
  public val phoneNumber: String = "",
  public val message: String = ""
)
