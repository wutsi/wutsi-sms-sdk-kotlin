package com.wutsi.platform.sms.dto

import kotlin.String

public data class SendMessageRequest(
  public val phoneNumber: String = "",
  public val message: String = ""
)
