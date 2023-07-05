package vladproduction.factory.websiteFactoryExample;

public class FactoryDemo {
    public static void main(String[] args) {

        //creating website as blog and shop (simply):
        Website websiteBlog = WebsiteFactory.getWebsite("blog");
        Website websiteShop = WebsiteFactory.getWebsite("shop");

        System.out.println("websiteBlog:\n"+websiteBlog);
        System.out.println(websiteBlog.getPages());

        System.out.println("websiteShop:\n"+websiteShop);
        System.out.println(websiteShop.getPages());


    }
}
