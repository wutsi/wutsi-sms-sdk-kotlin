package com.wutsi.platform.sms.dto

import kotlin.String

public data class SendVerificationRequest(
  public val phoneNumber: String = "",
  public val language: String = "en"
)
