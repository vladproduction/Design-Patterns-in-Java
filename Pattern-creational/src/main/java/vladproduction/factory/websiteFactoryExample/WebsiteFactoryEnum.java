package vladproduction.factory.websiteFactoryExample;

public class WebsiteFactoryEnum {

    public static Website getWebsite(WebsiteTypeEnum typeSite){

        switch (typeSite){
            case BLOG:{
                return new Blog();
            }
            case SHOP:{
                return new Shop();
            }
            default : {
                return null;
            }
        }
    }
}
