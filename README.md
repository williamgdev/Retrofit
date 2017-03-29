# Retrofit

*XML Example*

Sample Response :

    <?xml version="1.0" encoding="UTF-8"?>
    <rss xmlns:atom="http://www.w3.org/2005/Atom" xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:itunes="http://www.itunes.com/dtds/podcast-1.0.dtd" xmlns:media="http://search.yahoo.com/mrss/" version="2.0">
       <channel>
          <title>title</title>
          <description></description>
          <language>en-us</language>
          <item>
             <title>text</title>
             <link>text</link>
             <description>text</description>
             <enclosure url="text" length="2043520" type="image/jpeg" />
             <guid isPermaLink="false">text</guid>
             <pubDate>Fri, 17 Jun 2016 11:43 EDT</pubDate>
             <source url="text">text</source>
          </item>
          <item>
             <title>text</title>
             <link>text</link>
             <description>text</description>
             <enclosure url="text" length="1735257" type="image/jpeg" />
             <guid isPermaLink="false">text</guid>
             <pubDate>Thu, 16 Jun 2016 10:17 EDT</pubDate>
             <source url="text"></source>
          </item>
       </channel>
    </rss>


*Pojo 1*:
    
    import org.simpleframework.xml.Element;
    import org.simpleframework.xml.ElementList;
    import org.simpleframework.xml.Root;
    
    import java.util.List;
    
    @Root(name = "rss", strict=false)
    public class ArticleResponse {
    
        @Element(name = "channel")
        public Channel channel;
    
        public class Channel {
    
            @ElementList
            public List<Article> articles;
        }
    }


*Pojo 2*:

    import org.simpleframework.xml.Attribute;
    import org.simpleframework.xml.Element;
    import org.simpleframework.xml.Text;
    
    @Element(name = "item")
    public class Article {
    
        @Element(name = "title")
        private String title;
    
        @Element(name = "link")
        private String link;
    
        @Element(name = "description")
        private String description;
    
        @Element(name = "enclosure")
        private Enclosure enclosure;
    
        @Element(name = "guid")
        private String guid;
    
        @Element(name = "pubDate")
        private String pubDate;
    
        @Element(name = "source")
        private Source source;
    
        public class Enclosure {
    
            @Attribute(name = "url")
            private String url;
    
            @Attribute(name = "length")
            private long length;
    
            @Attribute(name = "type")
            private String type;
        }
    
        public class Source {
    
            @Attribute(name = "url")
            private String url;
    
            @Text
            private String text;
        }
    }