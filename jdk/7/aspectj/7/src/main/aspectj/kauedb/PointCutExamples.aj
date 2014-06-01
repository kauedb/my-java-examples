package kauedb;

/**
 * User: kauedb
 * Date: 5/1/14
 * Time: 9:55 AM
 */
public aspect PointCutExamples {

    pointcut pointCut1(): execute(* kauedb.Waved.hello(..));


    before() : poinCut1() {
        System.out.println("before");
    }

    after() : poinCut1() {
        System.out.println("after");
    }

}
