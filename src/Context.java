/**
 * Created by Administrator on 2017/9/15.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //上下文接口
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
