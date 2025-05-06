public class Manager implements  ReqHandler{
    private ReqHandler reqHandler;

    @Override
    public void setNextHandler(ReqHandler reqHandler) {
        this.reqHandler=reqHandler;
    }

    @Override
    public void reqHandle(int level) {
        if(level == 2){
            System.out.println("Req handled by Manager");
        }
        else {
            System.out.println("Req transfered by Manager");
            reqHandler.reqHandle(level);
        }
    }
    
}