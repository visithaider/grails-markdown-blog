package com.sourcerefinery.markdownblog

/**
 * A post or page.
 */
class MarkdownBlogPost {
    String title
    String type = "post"
    String status = "draft"
    String permalink
    String teaser
    String markdown
    String html
    String author
    Date date
    Date dateCreated // auto
    Date lastUpdated // auto

    static constraints = {
        title(nullable: false, blank: false, maxSize: 500)
        type(nullable: false, inList: ["post", "page"])
        status(nullable: false, inList: ["draft", "published", "deleted"])
        permalink(nullable: true, maxSize: 200)
        teaser(nullable: true, blank: true, maxSize: 4096)
        markdown(nullable: true, blank: true)
        html(nullable: true, blank: true)
        author(nullable: true, blank: true, maxSize: 200)
        date(nullable: true)
        dateCreated(nullable: false)
        lastUpdated(nullable: false)
    }

    static mapping = {
        table("markdown_blog_post")
        markdown(type: "text")
        html(type: "text")
    }
}
