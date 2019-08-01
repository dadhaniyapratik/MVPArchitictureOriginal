package com.mvparchiticture.util.rest

import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.data.model.response.ResultResponse
import io.reactivex.Single
import retrofit2.http.GET

interface RestAPI {

    @GET("rest/v2/all")
    fun country(): Single<List<CountryItem>>

//    @GET("/api/users")
//    fun country(): Single<ResultResponse<List<CountryItem>>>

}
//    @POST
//    fun appLoad(@Url url :String,@Body appLoad: AppLoadRequest): Single<ResultResponse<AppLoadItem>>
//
//    @POST
//    fun login(@Url url :String,@Body login: LoginRequest): Single<ResultResponse<UserItem>>
//
//    @POST
//    fun signUp(@Url url :String,@Body login: SignUpRequest): Single<ResultResponse<UserItem>>
//
//    @POST
//    fun logoutUser(@Url url :String,@Body request: LogoutRequest): Single<ResultResponse<Any>>
//
//    @GET
//    fun benefits(@Url url :String): Single<ResultResponse<List<BenefitsItem>>>
//
//    @GET
//    fun getNonMemberHomeScreenData(@Url url :String): Single<ResultResponse<NonMemberHomeItem>>
//
//    @GET
//    fun getMemberHomeScreenData(@Url url :String): Single<ResultResponse<MemberHomeItem>>
//
//    @POST
//    fun searchCar(@Url url :String,@Body request: SearchRequest): Single<ResultResponse<List<SearchItem>>>
//
//    @GET
//    fun getMake(@Url url :String): Single<ResultResponse<List<MakeItem>>>
//
//    @GET
//    fun aboutus(@Url url :String): Single<ResultResponse<List<AboutUsItem>>>
//
//    @POST
//    fun contactus(@Url url :String,@Body contactus: ContactUsRequest): Single<ResultResponse<ContactUsItem>>
//
//    @GET
//    fun userprofile(@Url url :String): Single<ResultResponse<UserItem>>
//
//    @POST
//    fun updateuserprofile(@Url url :String,@Body login: UpdateProfileRequest): Single<ResultResponse<UserItem>>
//
//    @GET
//    fun faq(@Url url :String): Single<ResultResponse<List<FAQItem>>>
//
//    @POST
//    fun standardfeature(@Url url :String,@Body standardFeaturesRequest: StandardFeaturesRequest): Single<ResultResponse<StandardFeaturesItem>>
//
//    @GET
//    fun reportList(@Url url :String): Single<ResultResponse<ReportListResponse>>
//
//    @POST
//    fun optionList(@Url url :String,@Body optionRequest: OptionRequest): Single<ResultResponse<OptionItem>>
//
//    @POST
//    fun optionConfirmation(@Url url :String,@Body optionRequest: OptionRequest): Single<ResultResponse<OptionItem>>
//
//    @POST
//    fun incentiveList(@Url url :String,@Body incentiveRequest: GetIncentiveRequest): Single<ResultResponse<List<IncentiveItem>>>
//
//    @POST
//    fun submitQuestionaire(@Url url :String,@Body incentiveRequest: QuestionaireRequest): Single<ResultResponse<Any>>
//
//    @POST
//    fun vehicleSummary(@Url url :String,@Body vehicleSummaryRequest: VehicleSummaryRequest): Single<ResultResponse<VehicleSummaryItem>>
//
//    @POST
//    fun similarVehicle(@Url url :String,@Body similarVehicleRequest: SimilarVehicleRequest): Single<ResultResponse<List<ComparableReportItem>>>
//
//    @POST
//    fun vehicleReport(@Url url :String,@Body vehicleReportRequest: VehicleReportRequest): Single<ResultResponse<VehicleReportItem>>
//
//    @POST
//    fun notifyme(@Url url :String,@Body notifyMeRequest: NotifyMeRequest): Single<ResultResponse<Any>>
//
//    @POST
//    fun reportByOption(@Url url :String,@Body notifyMeRequest: GenerateReportByOptionRequest): Single<ResultResponse<ReportByOptionItem>>
//
//    @POST
//    fun generateNewReport(@Url url :String,@Body notifyMeRequest: GenerateNewReportRequest): Single<ResultResponse<ReportByOptionItem>>
//
//
//    @POST
//    fun getStyle(@Url url :String,@Body request: StyleRequest): Single<ResultResponse<StyleItem>>
//
//    @POST
//    fun getColor(@Url url :String,@Body request: ColorRequest): Single<ResultResponse<List<ColorItem>>>
//
//    @POST
//    fun getModel(@Url url :String,@Body request: ModelRequest): Single<ResultResponse<List<ModelItem>>>
//
//    @POST
//    fun getYear(@Url url :String,@Body request: YearRequest): Single<ResultResponse<List<YearItem>>>
//
//    @POST
//    fun getDetailedReport(@Url url :String,@Body request: VehicleReportRequest): Single<ResultResponse<ReportItem>>
//
//    @POST
//    fun userOtpRequest(@Url url :String,@Body request: GetUserOtpRequest): Single<ResultResponse<RegisterPartialItem>>
//
//    @POST
//    fun getUserOtpToChangeMobile(@Url url :String,@Body request: GetUserOtpRequest): Single<ResultResponse<RegisterPartialItem>>
//
//    @POST
//    fun validateLogin(@Url url :String,@Body request: ValidateLoginRequest): Single<ResultResponse<UserItem>>
//
//
//    @POST
//    fun registerPartial(@Url url :String,@Body request: RegisterPartialRequest): Single<ResultResponse<RegisterPartialItem>>
//
//    @POST
//    fun registerFinal(@Url url :String,@Body request: RegisterFinalRequest): Single<ResultResponse<UserItem>>
//
//
//    @POST
//    fun resendotp(@Url url :String,@Body request: ResendOtpRequest): Single<ResultResponse<RegisterPartialItem>>
//
//    @POST
//    fun checkMobileNo(@Url url :String,@Body request: GetUserOtpRequest): Single<ResultResponse<Any>>
//
//    @GET
//    fun sampleReport(@Url url :String): Single<ResultResponse<ReportItem>>
//
//    @POST
//    fun getReportByMail(@Url url :String,@Body request: StandardFeaturesRequest): Single<ResultResponse<Any>>

