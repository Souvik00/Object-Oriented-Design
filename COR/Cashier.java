public class Cashier implements  ReqHandler{
    private ReqHandler reqHandler;

    @Override
    public void setNextHandler(ReqHandler reqHandler) {
        this.reqHandler=reqHandler;
    }

    @Override
    public void reqHandle(int level) {
        if(level == 1){
            System.out.println("Req handled by Cashier");
        }
        else {
            System.out.println("Req transfered by Cashier");
            reqHandler.reqHandle(level);
        }
    }
    
}