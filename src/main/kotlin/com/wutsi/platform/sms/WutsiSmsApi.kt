package com.wutsi.platform.sms

import com.wutsi.platform.sms.dto.SendMessageRequest
import com.wutsi.platform.sms.dto.SendMessageResponse
import com.wutsi.platform.sms.dto.SendVerificationRequest
import com.wutsi.platform.sms.dto.SendVerificationResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiSmsApi {
  @RequestLine("POST /v1/sms/messages")
  @Headers("Content-Type: application/json")
  public fun sendMessage(request: SendMessageRequest): SendMessageResponse

  @RequestLine("POST /v1/sms/verifications")
  @Headers("Content-Type: application/json")
  public fun sendVerification(request: SendVerificationRequest): SendVerificationResponse

  @RequestLine("GET /v1/sms/verifications/{id}?code={code}")
  @Headers("Content-Type: application/json")
  public fun validateVerification(@Param("id") id: Long, @Param("code") code: String): Unit
}
