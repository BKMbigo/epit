package epit.dsl.androidx

object EpitAndroidxGeneralTestScope {

    fun EpitAndroidxGeneralTestScope.testCore(testCoreVersion: String, block: EpitAndroidXTestCoreScope.() -> Unit) {
        block(EpitAndroidXTestCoreScope(testCoreVersion))
    }

    fun EpitAndroidxGeneralTestScope.testRules(testRulesVersion: String, block: EpitAndroidXTestRulesScope.() -> Unit) {
        block(EpitAndroidXTestRulesScope(testRulesVersion))
    }

    fun EpitAndroidxGeneralTestScope.testRunner(
        testRunnerVersion: String,
        block: EpitAndroidXTestRunnerScope.() -> Unit
    ) {
        block(EpitAndroidXTestRunnerScope(testRunnerVersion))
    }

}
