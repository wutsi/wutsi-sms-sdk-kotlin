package com.wutsi.platform.msm.dto

import kotlin.String

public data class SendVerificationRequest(
  public val phoneNumber: String = "",
  public val language: String = "en"
)
