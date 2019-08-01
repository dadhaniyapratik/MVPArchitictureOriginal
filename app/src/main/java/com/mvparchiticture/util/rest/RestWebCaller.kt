package com.mvparchiticture.util.rest

import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.util.extensions.handleException
import io.reactivex.Single

object RestWebCaller {


    private var service: RestAPI = ServiceGenerator.createService(RestAPI::class.java)

    /*fun recreateInstance() {
        service = ServiceGenerator.createService(RestAPI::class.java)
    }*/

    fun getCountry(): Single<List<CountryItem>> {
        return service.country().map { it!! }.handleException()
    }
//
//    fun loginUser(request: LoginRequest): Single<UserItem> {
//        return service.login("${CommonUtils.getEndPoint()}Login",request).map { it.data!! }.handleException()
//    }
//
//    fun signUpUser(request: SignUpRequest): Single<UserItem> {
//        return service.signUp("${CommonUtils.getEndPoint()}register",request).map { it.data!! }.handleException()
//    }
//
//    fun logoutUser(request: LogoutRequest): Single<ResultResponse<Any>> {
//        return service.logoutUser("${CommonUtils.getEndPoint()}Logout",request).map { it }.handleException()
//    }
//
//    fun getNonMemberHomeScreenData(): Single<NonMemberHomeItem> {
//        return service.getNonMemberHomeScreenData("${CommonUtils.getEndPoint()}nonMemberHomeData").map { it.data!! }.handleException()
//    }
//
//    fun getMemberHomeScreenData(): Single<MemberHomeItem> {
//        return service.getMemberHomeScreenData("${CommonUtils.getEndPoint()}getMemberHomeData").map { it.data!! }.handleException()
//    }
//
//    fun memberBenefits(): Single<List<BenefitsItem>> {
//        return service.benefits("${CommonUtils.getEndPoint()}getMemberBenifits").map { it.data!! }.handleException()
//    }
//
//    fun searchCar(request: SearchRequest): Single<List<SearchItem>> {
//        return service.searchCar("${CommonUtils.getEndPoint()}searchCar",request).map { it.data!! }.handleException()
//    }
//
//    fun getMake(): Single<List<MakeItem>> {
//        return service.getMake("${CommonUtils.getEndPoint()}getVehiclesMakeList").map { it.data!! }.handleException()
//    }
//
//    fun getAboutUs(): Single<List<AboutUsItem>> {
//        return service.aboutus("${CommonUtils.getEndPoint()}aboutUs").map { it.data!! }.handleException()
//    }
//
//    fun getContctUs(request: ContactUsRequest): Single<ContactUsItem> {
//        return service.contactus("${CommonUtils.getEndPoint()}contactUs",request).map { it.data!! }.handleException()
//    }
//
//    fun getUserProfile(): Single<UserItem> {
//        return service.userprofile("${CommonUtils.getEndPoint()}getProfile").map { it.data!! }.handleException()
//    }
//
//    fun updateUserProfile(request: UpdateProfileRequest): Single<UserItem> {
//        return service.updateuserprofile("${CommonUtils.getEndPoint()}updateProfile",request).map { it.data!! }.handleException()
//    }
//
//    fun getFAQ(): Single<List<FAQItem>> {
//        return service.faq("${CommonUtils.getEndPoint()}FAQ").map { it.data!! }.handleException()
//    }
//
//    fun getStandardFeatures(request: StandardFeaturesRequest): Single<StandardFeaturesItem> {
//        return service.standardfeature("${CommonUtils.getEndPoint()}getStandardFeauturesList",request).map { it.data!! }.handleException()
//    }
//
//    fun getReportList(): Single<ReportListResponse> {
//        return service.reportList("${CommonUtils.getEndPoint()}getGeneratedReports").map { it.data!! }.handleException()
//    }
//
//    fun getOptionList(request: OptionRequest): Single<OptionItem> {
//        return service.optionList("${CommonUtils.getEndPoint()}getOptions",request).map { it.data!! }.handleException()
//    }
//
//    fun getOptionOptionConfirmation(request: OptionRequest): Single<OptionItem> {
//        return service.optionConfirmation("${CommonUtils.getEndPoint()}onOptionConfirmation",request).map { it.data!! }.handleException()
//    }
//
//    fun getIncentiveList(request: GetIncentiveRequest): Single<List<IncentiveItem>> {
//        return service.incentiveList("${CommonUtils.getEndPoint()}getIncentiveList",request).map { it.data!! }.handleException()
//    }
//
//    fun submitQuestionaire(request: QuestionaireRequest): Single<Any> {
//        return service.submitQuestionaire("${CommonUtils.getEndPoint()}submitQuestionnaire",request).map { it.data!! }.handleException()
//    }
//
//    fun getVehicleSummary(request: VehicleSummaryRequest): Single<VehicleSummaryItem> {
//        return service.vehicleSummary("${CommonUtils.getEndPoint()}getVehicleSummary",request).map { it.data!! }.handleException()
//    }
//
//    fun getSimilarVehicle(request: SimilarVehicleRequest): Single<List<ComparableReportItem>> {
//        return service.similarVehicle("${CommonUtils.getEndPoint()}getSimilarVehicles",request).map { it.data!! }.handleException()
//    }
//
//    fun getVehicleReportInformation(request: VehicleReportRequest): Single<VehicleReportItem> {
//        return service.vehicleReport("${CommonUtils.getEndPoint()}getVehicleReport",request).map { it.data!! }.handleException()
//    }
//
//    fun getNotifyMe(request: NotifyMeRequest): Single<Any> {
//        return service.notifyme("${CommonUtils.getEndPoint()}notifyMe",request).map { it.data!! }.handleException()
//    }
//
//    fun getGenerateReportByOption(request: GenerateReportByOptionRequest): Single<ReportByOptionItem> {
//        return service.reportByOption("${CommonUtils.getEndPoint()}genrateReportByOption",request).map { it.data!! }.handleException()
//    }
//
//    fun getModel(request: ModelRequest): Single<List<ModelItem>> {
//        return service.getModel("${CommonUtils.getEndPoint()}getVehiclesModelList",request).map { it.data!! }.handleException()
//    }
//
//    fun getYear(request: YearRequest): Single<List<YearItem>> {
//        return service.getYear("${CommonUtils.getEndPoint()}getYearsList",request).map { it.data!! }.handleException()
//    }
//
//    fun getStyle(request: StyleRequest): Single<StyleItem> {
//        return service.getStyle("${CommonUtils.getEndPoint()}GetStyles",request).map { it.data!! }.handleException()
//    }
//
//    fun getColor(request: ColorRequest): Single<List<ColorItem>> {
//        return service.getColor("${CommonUtils.getEndPoint()}getColors",request).map { it.data!! }.handleException()
//    }
//
//    fun getGenerateNewReport(request: GenerateNewReportRequest): Single<ReportByOptionItem> {
//        return service.generateNewReport("${CommonUtils.getEndPoint()}generateNewReport",request).map { it.data!! }.handleException()
//    }
//
//    fun getDetailedReport(request: VehicleReportRequest): Single<ReportItem> {
//        return service.getDetailedReport("${CommonUtils.getEndPoint()}getDetailedReport",request).map { it.data!! }.handleException()
//    }
//
//
//    fun getUserOtp(request: GetUserOtpRequest): Single<RegisterPartialItem> {
//        return service.userOtpRequest("${CommonUtils.getEndPoint()}GetUserOTP",request).map { it.data!! }.handleException()
//    }
//
//    fun getUserOtpToChangeMobile(request: GetUserOtpRequest): Single<RegisterPartialItem> {
//        return service.getUserOtpToChangeMobile("${CommonUtils.getEndPoint()}GetChangePhoneOTP",request).map { it.data!! }.handleException()
//    }
//
//    fun validateLogin(request: ValidateLoginRequest): Single<UserItem> {
//        return service.validateLogin("${CommonUtils.getEndPoint()}ValidateAndLogin",request).map { it.data!! }.handleException()
//    }
//
//
//    fun getRegisterPartial(request: RegisterPartialRequest): Single<RegisterPartialItem> {
//        return service.registerPartial("${CommonUtils.getEndPoint()}RegisterPartial",request).map { it.data!! }.handleException()
//    }
//
//    fun getRegisterFinal(request: RegisterFinalRequest): Single<UserItem> {
//        return service.registerFinal("${CommonUtils.getEndPoint()}RegisterFinal",request).map { it.data!! }.handleException()
//    }
//
//
//    fun getReSendOtp(request: ResendOtpRequest): Single<RegisterPartialItem> {
//        return service.resendotp("${CommonUtils.getEndPoint()}ResendOTP",request).map { it.data!! }.handleException()
//    }
//
//    fun checkMobileNumber(request: GetUserOtpRequest): Single<Any> {
//        return service.checkMobileNo("${CommonUtils.getEndPoint()}checkMobile",request).map { it.data!! }.handleException()
//    }
//
//    fun getSampleReport(): Single<ReportItem> {
//        return service.sampleReport("${CommonUtils.getEndPoint()}getSampleReport").map { it.data!! }.handleException()
//    }
//
//    fun getReportByMail(request: StandardFeaturesRequest): Single<ResultResponse<Any>> {
//        return service.getReportByMail("${CommonUtils.getEndPoint()}getReportByMail",request).map { it }.handleException()
//    }
//
//    fun getVimeoVideoList(): Single<List<VideoTutorialItem>> {
//        return service.getVimeoVideoList().map { it.data!! }.handleException()
//    }

//
//
//    fun redeemTokens(apiVersion: String, redeemTokenRequest: RedeemTokenRequest) : Single<ResultResponse<Any>>{
//        return service.redeemTokens(apiVersion, redeemTokenRequest).map { it }.handleException()
//    }
//
//    fun redeemHistory(apiVersion: String,redeemHistoryRequest: RedeemHistoryRequest) : Observable<List<HistoryItem>> {
//        return service.redeemHistory(apiVersion, redeemHistoryRequest).map { it.data!! }.handleException()
//    }

}