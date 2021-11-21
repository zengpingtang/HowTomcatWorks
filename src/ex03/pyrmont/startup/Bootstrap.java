package ex03.pyrmont.startup;

import ex03.pyrmont.connector.http.HttpConnector;

public final class Bootstrap {
    /**
     * 实例化HttpConnector，调用线程start启动
     * @param args
     */
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        connector.start();
    }
}