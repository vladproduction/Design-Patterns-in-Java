package vladproduction.factory.websiteFactoryExample;

public class WebsiteFactory {

    public static Website getWebsite(String typeSite){

        switch (typeSite){
            case "blog":{
                return new Blog();
            }
            case "shop":{
                return new Shop();
            }
            default : {
                return null;
            }
        }
    }
}
