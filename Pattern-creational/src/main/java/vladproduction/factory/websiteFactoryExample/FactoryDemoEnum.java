package vladproduction.factory.websiteFactoryExample;

import static vladproduction.factory.websiteFactoryExample.WebsiteTypeEnum.BLOG;
import static vladproduction.factory.websiteFactoryExample.WebsiteTypeEnum.SHOP;

public class FactoryDemoEnum {
    public static void main(String[] args) {

        //creating website as blog and shop (Enum):
        Website websiteBlog = WebsiteFactoryEnum.getWebsite(BLOG);
        Website websiteShop = WebsiteFactoryEnum.getWebsite(SHOP);

        System.out.println("websiteBlog:\n"+websiteBlog);
        System.out.println(websiteBlog.getPages());

        System.out.println("websiteShop:\n"+websiteShop);
        System.out.println(websiteShop.getPages());


    }
}
