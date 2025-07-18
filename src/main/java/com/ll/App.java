package com.ll;

import com.ll.article.ArticleController;
import com.ll.db.DBConnection;
import com.ll.system.SystemController;

public class App {
    ArticleController articleController;
    SystemController systemController;
    Container container;

    App(){
        DBConnection.DB_NAME = "hjDB";
        DBConnection.DB_PORT = 3306;
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";


        Container.getDBConnection().connect();
        articleController = new ArticleController();
        systemController = new SystemController();
        container = new Container();
    }
    public void run(){

        System.out.println();
    }
}
