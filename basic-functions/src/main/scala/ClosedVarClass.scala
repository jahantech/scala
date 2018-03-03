class ClosedVarsClass(){
    private var test_val:Int= 0

    private def privateFunc(){
        test_val = test_val + 1
    }

    def GetPrivateVarVal(){
        privateFunc()
        println(test_val)
    }
}