package vladproduction.factory.websiteFactoryExample;

public class Blog extends Website{

    @Override
    public void createWebsite() {

        pages.add(new EmailBlogPage());
        pages.add(new AboutBlogPage());
        pages.add(new CommentBlogPage());
        pages.add(new SubscribeBlogPage());
    }
}
