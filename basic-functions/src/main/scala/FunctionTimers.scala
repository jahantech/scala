class FunctionTimers() {
    
    var currentTime = 0.0 
    var endTime = 0.0

    def StartTimer(){
        currentTime = System.nanoTime()
    }

    def EndTimer(){
        endTime = System.nanoTime()
    }

    def GetTime(){
        println((endTime - currentTime)/1000000000)
    }
}

