
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class lcauto145 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://lcauto145.cnx.cwp.pnp-hcl.com")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("en-US,en;q=0.9")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("Cache-Control", "no-cache");
    headers_0.put("Pragma", "no-cache");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "none");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    headers_0.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_1.put("pragma", "no-cache");
    headers_1.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Windows");
    headers_1.put("sec-fetch-dest", "document");
    headers_1.put("sec-fetch-mode", "navigate");
    headers_1.put("sec-fetch-site", "same-site");
    headers_1.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_2.put("origin", "null");
    headers_2.put("pragma", "no-cache");
    headers_2.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Windows");
    headers_2.put("sec-fetch-dest", "document");
    headers_2.put("sec-fetch-mode", "navigate");
    headers_2.put("sec-fetch-site", "same-origin");
    headers_2.put("sec-fetch-user", "?1");
    headers_2.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Accept", "text/css,*/*;q=0.1");
    headers_3.put("Cache-Control", "no-cache");
    headers_3.put("Pragma", "no-cache");
    headers_3.put("Sec-Fetch-Dest", "style");
    headers_3.put("Sec-Fetch-Mode", "no-cors");
    headers_3.put("Sec-Fetch-Site", "same-origin");
    headers_3.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("Cache-Control", "no-cache");
    headers_7.put("Pragma", "no-cache");
    headers_7.put("Sec-Fetch-Dest", "script");
    headers_7.put("Sec-Fetch-Mode", "no-cors");
    headers_7.put("Sec-Fetch-Site", "same-origin");
    headers_7.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("Cache-Control", "no-cache");
    headers_10.put("Pragma", "no-cache");
    headers_10.put("Sec-Fetch-Dest", "empty");
    headers_10.put("Sec-Fetch-Mode", "cors");
    headers_10.put("Sec-Fetch-Site", "same-origin");
    headers_10.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_10.put("sec-ch-ua-mobile", "?0");
    headers_10.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_12 = new HashMap<>();
    headers_12.put("Cache-Control", "no-cache");
    headers_12.put("Content-Type", "application/x-www-form-urlencoded");
    headers_12.put("Pragma", "WWW-Authenticate=XHR");
    headers_12.put("Sec-Fetch-Dest", "empty");
    headers_12.put("Sec-Fetch-Mode", "cors");
    headers_12.put("Sec-Fetch-Site", "same-origin");
    headers_12.put("X-Requested-With", "XMLHttpRequest");
    headers_12.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_12.put("sec-ch-ua-mobile", "?0");
    headers_12.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_13.put("Cache-Control", "no-cache");
    headers_13.put("Pragma", "no-cache");
    headers_13.put("Sec-Fetch-Dest", "image");
    headers_13.put("Sec-Fetch-Mode", "no-cors");
    headers_13.put("Sec-Fetch-Site", "same-origin");
    headers_13.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_13.put("sec-ch-ua-mobile", "?0");
    headers_13.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_20 = new HashMap<>();
    headers_20.put("origin", "https://lcauto145.cnx.cwp.pnp-hcl.com");
    headers_20.put("pragma", "no-cache");
    headers_20.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_20.put("sec-ch-ua-mobile", "?0");
    headers_20.put("sec-ch-ua-platform", "Windows");
    headers_20.put("sec-fetch-dest", "empty");
    headers_20.put("sec-fetch-mode", "cors");
    headers_20.put("sec-fetch-site", "same-site");
    
    Map<CharSequence, String> headers_22 = new HashMap<>();
    headers_22.put("Cache-Control", "max-age=2592000");
    headers_22.put("Content-Type", "application/x-www-form-urlencoded");
    headers_22.put("Pragma", "WWW-Authenticate=XHR");
    headers_22.put("Sec-Fetch-Dest", "empty");
    headers_22.put("Sec-Fetch-Mode", "cors");
    headers_22.put("Sec-Fetch-Site", "same-origin");
    headers_22.put("X-Requested-With", "XMLHttpRequest");
    headers_22.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_22.put("sec-ch-ua-mobile", "?0");
    headers_22.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_33 = new HashMap<>();
    headers_33.put("Cache-Control", "no-cache");
    headers_33.put("Content-Type", "application/json");
    headers_33.put("Origin", "https://lcauto145.cnx.cwp.pnp-hcl.com");
    headers_33.put("Pragma", "no-cache");
    headers_33.put("Sec-Fetch-Dest", "empty");
    headers_33.put("Sec-Fetch-Mode", "cors");
    headers_33.put("Sec-Fetch-Site", "same-origin");
    headers_33.put("X-CRE-persistenceurl", "https://lcauto145.cnx.cwp.pnp-hcl.com/homepage/web/itemSetPersistence.action");
    headers_33.put("X-Shindig-ST", "default:y8Ot1bBzYCy_2Ts_YHMRpeze2UgblxXifV3VYD6Q5llnwwDCrYJvDuwmUqDgYw8jSiO-X4GrHYUmLvzEXXHcVLNtpevNjscZYD1B6mPfCJ52iAq_uCd8yVT3AYyiEPqxfOSpOiFROp2LnjBYbwerYR_36B6Vka3Th2qe1FRyRTY");
    headers_33.put("container", "default");
    headers_33.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_33.put("sec-ch-ua-mobile", "?0");
    headers_33.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_34 = new HashMap<>();
    headers_34.put("Cache-Control", "no-cache");
    headers_34.put("Content-Type", "application/json");
    headers_34.put("Origin", "https://lcauto145.cnx.cwp.pnp-hcl.com");
    headers_34.put("Pragma", "no-cache");
    headers_34.put("Sec-Fetch-Dest", "empty");
    headers_34.put("Sec-Fetch-Mode", "cors");
    headers_34.put("Sec-Fetch-Site", "same-origin");
    headers_34.put("X-Shindig-ST", "default:y8Ot1bBzYCy_2Ts_YHMRpeze2UgblxXifV3VYD6Q5llnwwDCrYJvDuwmUqDgYw8jSiO-X4GrHYUmLvzEXXHcVLNtpevNjscZYD1B6mPfCJ52iAq_uCd8yVT3AYyiEPqxfOSpOiFROp2LnjBYbwerYR_36B6Vka3Th2qe1FRyRTY");
    headers_34.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_34.put("sec-ch-ua-mobile", "?0");
    headers_34.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_35 = new HashMap<>();
    headers_35.put("Cache-Control", "no-cache");
    headers_35.put("Client-Loaded-Features", "actions::com.ibm.connections.ee::com.ibm.connections.sharedialog::container::container.nongadget::core::cre.iruntime::cre.iwidget::cre.iwidget.event::cre.iwidget.itemset::cre.messages.en::cre.osgadget::cre.service.event::cre.service.people::cre.wire::embedded-experiences::ibm.connections.ee::ibm.connections.sharedialog::open-views::pubsub-2::rpc::selection::shared-script-frame::shindig.sha1::views");
    headers_35.put("Pragma", "no-cache");
    headers_35.put("Sec-Fetch-Dest", "empty");
    headers_35.put("Sec-Fetch-Mode", "cors");
    headers_35.put("Sec-Fetch-Site", "same-origin");
    headers_35.put("X-Shindig-ST", "default:y8Ot1bBzYCy_2Ts_YHMRpeze2UgblxXifV3VYD6Q5llnwwDCrYJvDuwmUqDgYw8jSiO-X4GrHYUmLvzEXXHcVLNtpevNjscZYD1B6mPfCJ52iAq_uCd8yVT3AYyiEPqxfOSpOiFROp2LnjBYbwerYR_36B6Vka3Th2qe1FRyRTY");
    headers_35.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_35.put("sec-ch-ua-mobile", "?0");
    headers_35.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_37 = new HashMap<>();
    headers_37.put("Cache-Control", "no-cache");
    headers_37.put("Origin", "https://lcauto145.cnx.cwp.pnp-hcl.com");
    headers_37.put("Pragma", "WWW-Authenticate=XHR");
    headers_37.put("Sec-Fetch-Dest", "empty");
    headers_37.put("Sec-Fetch-Mode", "cors");
    headers_37.put("Sec-Fetch-Site", "same-origin");
    headers_37.put("X-Requested-With", "XMLHttpRequest");
    headers_37.put("X-Update-Nonce", "true");
    headers_37.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_37.put("sec-ch-ua-mobile", "?0");
    headers_37.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_38 = new HashMap<>();
    headers_38.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_38.put("Cache-Control", "no-cache");
    headers_38.put("Pragma", "no-cache");
    headers_38.put("Sec-Fetch-Dest", "iframe");
    headers_38.put("Sec-Fetch-Mode", "navigate");
    headers_38.put("Sec-Fetch-Site", "same-origin");
    headers_38.put("Upgrade-Insecure-Requests", "1");
    headers_38.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_38.put("sec-ch-ua-mobile", "?0");
    headers_38.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_47 = new HashMap<>();
    headers_47.put("Cache-Control", "no-cache");
    headers_47.put("Content-Type", "application/x-www-form-urlencoded");
    headers_47.put("Pragma", "no-cache");
    headers_47.put("Sec-Fetch-Dest", "empty");
    headers_47.put("Sec-Fetch-Mode", "cors");
    headers_47.put("Sec-Fetch-Site", "same-origin");
    headers_47.put("X-CALENDAR-MEMBERSHIP", "NONE");
    headers_47.put("X-Requested-With", "XMLHttpRequest");
    headers_47.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_47.put("sec-ch-ua-mobile", "?0");
    headers_47.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_51 = new HashMap<>();
    headers_51.put("Accept", "application/json, text/plain, */*");
    headers_51.put("Cache-Control", "no-cache");
    headers_51.put("Pragma", "no-cache");
    headers_51.put("Sec-Fetch-Dest", "empty");
    headers_51.put("Sec-Fetch-Mode", "cors");
    headers_51.put("Sec-Fetch-Site", "same-origin");
    headers_51.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_51.put("sec-ch-ua-mobile", "?0");
    headers_51.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_64 = new HashMap<>();
    headers_64.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_64.put("Cache-Control", "no-cache");
    headers_64.put("Pragma", "no-cache");
    headers_64.put("Sec-Fetch-Dest", "document");
    headers_64.put("Sec-Fetch-Mode", "navigate");
    headers_64.put("Sec-Fetch-Site", "same-origin");
    headers_64.put("Sec-Fetch-User", "?1");
    headers_64.put("Upgrade-Insecure-Requests", "1");
    headers_64.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_64.put("sec-ch-ua-mobile", "?0");
    headers_64.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_66 = new HashMap<>();
    headers_66.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_66.put("Cache-Control", "no-cache");
    headers_66.put("Pragma", "no-cache");
    headers_66.put("Sec-Fetch-Dest", "iframe");
    headers_66.put("Sec-Fetch-Mode", "navigate");
    headers_66.put("Sec-Fetch-Site", "same-site");
    headers_66.put("Upgrade-Insecure-Requests", "1");
    headers_66.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_66.put("sec-ch-ua-mobile", "?0");
    headers_66.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_67 = new HashMap<>();
    headers_67.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_67.put("Cache-Control", "no-cache");
    headers_67.put("Pragma", "no-cache");
    headers_67.put("Sec-Fetch-Dest", "document");
    headers_67.put("Sec-Fetch-Mode", "navigate");
    headers_67.put("Sec-Fetch-Site", "same-site");
    headers_67.put("Upgrade-Insecure-Requests", "1");
    headers_67.put("sec-ch-ua", "Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"115\", \"Chromium\";v=\"115");
    headers_67.put("sec-ch-ua-mobile", "?0");
    headers_67.put("sec-ch-ua-platform", "Windows");
    
    String uri2 = "https://keycloakbvt.cnx.cwp.pnp-hcl.com/realms/hcl";

    ScenarioBuilder scn = scenario("lcauto145")
      .exec(
        http("HomepageLogin")
          .get("/homepage/login")
          .headers(headers_0)
          .check(status().is(401))
          .resources(
            http("Keycloak1")
              .get(uri2 + "/protocol/openid-connect/auth?response_type=code&client_id=hcl-cnx-oidc-client&scope=openid&state=g4M72XyOQgEjnQE6ACnQTreKxNL8L13s6mWGXXnBxQk_1691566618533&redirect_uri=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%3A443%2Foidcclient%2Fkeycloak")
              .headers(headers_1)
          )
      )
      .pause(10)
      .exec(
        http("Keycloak2")
          .post(uri2 + "/login-actions/authenticate?session_code=t-n4SNWWYcUBWD3J_mH56G54gS1Yzh-qamfI4mcqdak&execution=b1dabab6-3166-4a32-b964-da0630b7df0d&client_id=hcl-cnx-oidc-client&tab_id=fNxH2aVSYgU")
          .headers(headers_2)
          .formParam("username", "ajones1")
          .formParam("password", "jones1")
          .formParam("credentialId", "")
          .resources(
            http("request_3")
              .get("/homepage/web/updates/#myStream/updates/all")
              .headers(headers_3)
            /*http("request_3")
              .get("/connections/resources/web/_style?include=com.ibm.lconn.core.styles.oneui3/base/package3.css&etag=20221026.163213")
              .headers(headers_3),
            http("request_4")
              .get("/connections/resources/web/_style?include=com.ibm.lconn.core.styles.oneui3/sprites.css&etag=20221026.163213")
              .headers(headers_3),
            http("request_5")
              .get("/connections/resources/web/_lconnappstyles/hikari/homepage.css?version=oneui3&rtl=false&etag=20221026.163213")
              .headers(headers_3),
            http("request_6")
              .get("/connections/resources/web/_lconntheme/hikari.css?version=oneui3&rtl=false&etag=20221026.163213")
              .headers(headers_3),
            http("request_7")
              .get("/connections/resources/web/_js/?include=dojo.main~&etag=20221026.163213&_proxyURL=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%2Fconnections%2Fresources&ss=20221026.163213&lang=en&country=US&variant=")
              .headers(headers_7),
            http("request_8")
              .get("/connections/resources/web/_js/?include=lconn.core.bundle_common~&etag=20221026.163213&exclude=dojo.main~&_proxyURL=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%2Fconnections%2Fresources&ss=20221026.163213&lang=en&country=US&variant=")
              .headers(headers_7),
            http("request_9")
              .get("/connections/resources/web/_js/?include=lconn.homepage.modules.common~lconn.homepage.modules.widgetDefs~lconn.homepage.modules.activityStream~lconn.news.microblogging.sharebox.InputForm~&etag=20221026.163213&exclude=dojo.main~lconn.core.bundle_common~&_proxyURL=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%2Fconnections%2Fresources&ss=20221026.163213&lang=en&country=US&variant=")
              .headers(headers_7),
            http("request_10")
              .get("/selfservice/acl/invite")
              .headers(headers_10),
            http("request_11")
              .get("/connections/resources/web/_style?include=ic-share.fileviewer.style.connections.css&etag=20221026.163213")
              .headers(headers_3),
            http("request_12")
              .get("/touchpoint/ui/enabled?dojo.preventCache=1691566636424")
              .headers(headers_12),
            http("request_13")
              .get("/connections/resources/web/com.ibm.lconn.core.styles.oneui3/images/blank.gif?etag=20221026.163213")
              .headers(headers_13),
            http("request_14")
              .get("/profiles/photo.do?userid=4cbc45c0-16a7-1033-9239-95472f45d54f&small=true")
              .headers(headers_13),
            http("request_15")
              .get("/connections/resources/web/com.ibm.social.hikari.theme/sprite/lotusSprite-8bit.png?etag=20221026.163213")
              .headers(headers_13),
            http("request_16")
              .get("/connections/resources/web/_lconnappstyles/hikari/activityStream.css?version=oneui3&rtl=false&etag=20221026.163213")
              .headers(headers_3),
            http("request_17")
              .get("/connections/resources/web/_js?include=ic-core.config.features~ic-core.icsTours.tours.tourController&exclude=lconn.core.bundle_common~lconn.homepage.modules.activityStream~lconn.homepage.modules.common~lconn.homepage.modules.widgetDefs~lconn.news.microblogging.sharebox.InputForm~&etag=20221026.163213&lang=en&country=US")
              .headers(headers_7),
            http("request_18")
              .get("/connections/opensocial/rest/activitystreams/@me/@all/@all?shortStrings=true&rollup=true&dojo.preventCache=1691566636743")
              .headers(headers_12),
            http("request_19")
              .get("/news/sharebox/config.action?type=local&resourceType=person&resourceId=4cbc45c0-16a7-1033-9239-95472f45d54f&dojo.preventCache=1691566636746")
              .headers(headers_12),
            http("request_20")
              .get(uri2 + "/.well-known/openid-configuration")
              .headers(headers_20),
            http("request_21")
              .get("/connections/resources/web/user/roles?role=global-moderator")
              .headers(headers_12),
            http("request_22")
              .get("/ic360/ui/nls/cors/locale_en.json")
              .headers(headers_22),
            http("request_23")
              .get("/connections/resources/web/com.ibm.lconn.core.styles.oneui3/images/OtherImages/ActivityStream/otherActivityStream12-8bit.png?etag=20221026.163213")
              .headers(headers_13),
            http("request_24")
              .get("/connections/resources/web/com.ibm.lconn.core.styles.oneui3/images/loading.gif?etag=20221026.163213")
              .headers(headers_13),
            http("request_25")
              .get("/connections/opensocial/rest/people/@me/@self?fields=userSettings.textDirection&fields=userSettings.bidiEnabled&fields=userSettings.calendar")
              .headers(headers_12),
            http("request_26")
              .get("/connections/resources/web/com.ibm.lconn.core.styles.oneui3/images/OtherImages/ActivityStream/otherActivityStream14-8bit.png?etag=20221026.163213")
              .headers(headers_13),
            http("request_27")
              .get("/connections/resources/web/com.ibm.social.hikari.theme/sprite/otherActivityStream14-8bit.png?etag=20221026.163213")
              .headers(headers_13),
            http("request_28")
              .get("/connections/opensocial/rest/people/@me/@self?fields=userSettings.textDirection&fields=userSettings.bidiEnabled&fields=userSettings.calendar")
              .headers(headers_12),
            http("request_29")
              .get("/connections/opensocial/gadgets/js/cre.iruntime:cre.iwidget.event:cre.wire:cre.iwidget:cre.iwidget.itemset:cre.util.stringify:cre.service.event:cre.osgadget:cre.messages.en:core:container:rpc:pubsub-2:views:embedded-experiences:open-views:selection:actions:viewenhancements:shared-script-frame:cre.service.people:ibm.connections.sharedialog:com.ibm.connections.sharedialog:com.ibm.connections.ee:ibm.connections.ee:container.nongadget:shindig.sha1:open-views.js?c=1&_ic_versionStamp=20221026.163213&ver=20221026.163213")
              .headers(headers_7),
            http("request_30")
              .get("/connections/opensocial/rest/ublog/@config/settings")
              .headers(headers_12),
            http("request_31")
              .get("/connections/resources/web/_js?include=dojo._base.window~dojo.request.notify~ic-core.config.features~ic-search.searchPanel.SearchPaneManager&exclude=ic-core.config.features~ic-core.icsTours.tours.tourController~lconn.core.bundle_common~lconn.homepage.modules.activityStream~lconn.homepage.modules.common~lconn.homepage.modules.widgetDefs~lconn.news.microblogging.sharebox.InputForm~&etag=20221026.163213&lang=en&country=US")
              .headers(headers_7),
            http("request_32")
              .get("/profiles/photo.do?r=true&userid=4cbc45c0-16a7-1033-9239-95472f45d54f")
              .headers(headers_13),
            http("request_33")
              .post("/connections/opensocial/common/processWidgets?format=json")
              .headers(headers_33)
              .body(RawFileBody("lcauto145/0033_request.json")),
            http("request_34")
              .post("/connections/opensocial/rpc")
              .headers(headers_34)
              .body(RawFileBody("lcauto145/0034_request.json")),
            http("request_35")
              .get("/connections/opensocial/common/resources?resources=cU5nc2NvNFBtVG1pcDh2eFl6bGNuX0h5NjNVbDl3OXpxSGlkNW5lNUJkeTV4azZ1eU5ETnpkdHF3anhtTzI3TG1oWXllbEs5VTlVNDVzb0RjVkNaZkdZLVhlSGtUaWZEQ3pZNWtJQUxBWS1xR2NYWXMwTEg0dHRTTEhndWx3Rko2LUt6OVdVU1otY0tRbzROOWRlM09rVEpNOWkxWk1zWlFKUVVRYVAteVZCX0RlX2NoQVpNRkJuWG1EbEF2RFpDT2J3SkRNeUtWdG1IZEN3LVB4NnVkMlN1LXpFc3BVVTVCS0pNelFHWVpsWUhoZUdTdGw3VGNxekFXd05JaUdlU3M4MWY3ejVFNVVEdEpRMmRuX0J4bFpWcnptLW9Nc2FRRWlTclNkUHljdi1od3V1LTMtQlpCVjJiNndIZ08xYU1qcVB5N0szUWhfMi1aUEozR2lKNGQ2YXlDcmxsXzNJZXF5dU9HR3czRXdNd3MyaFJHd2Jla3l5dlF5eFVZbzlNWno2YVZVU191MnllNmJlTXFHSU1mRGN0YVQtSzFHSFFSRlhNMkFPMG40d1V4VDdmYlBneVo2U2RQR2ZScW52di11T3ZmaUd2UHVKNzZQZFFZWC1JTHhQeEJQX3o3emRzbDRIVEJFejBXemRaOVVmbXVTUzB4TUlVRFZhZXlmbUctMktsZU9xVVpMTGNkMERxQ2J4RnVwaTlXRlhZQzFPWGFpR3BHSmpoMHVyV3Vlc2pBSDhGUmpwazN5SHdYYXJYNENhUW9WVndjSGhhQWxrczJtWFRsZld4RWU1ZldubmRXVnppSUJ6VHR5aklmLVBmX0FxQXVpaE9kb1RaelhuX1JET1dWODJwV1ZrcDIyX0dMeGxvSndsMEpfU1dYTnNnalR2bUpBQ3AxSFUzVHVxMFNKOEVCMXdZYkF2d3JMLVlRd2hYT3lSLVNyY0JtaUFjN0REeGs5bEF6aHlzUm9GY01Bdm5CSGRQOGtiVEowS0tnLUZPWFJaeHc4VVRSbDRiMUhXOEM2WHJJUl9JSmpJVWxidVM3ZFNzZktOS3o1Qk5fMW8zLWZGaHJHeVlWRHlNMjhmTld5NFY0RmNhR0VPQW00SkE2dw%3D%3D&mimeType=text/javascript&isClientInjection=true&pendingTimeout=1000&_h=4E5D4ABA7BDB2A432C57D51A1D4C286315E5CCF8")
              .headers(headers_35),
            http("request_36")
              .get("/activities/service/atom2/todos?sortfields=duedate%2Clastmod&sortorder=0%2C1&count=10&assignedToUserid=4cbc45c0-16a7-1033-9239-95472f45d54f&forceRefresh=1691566638385")
              .headers(headers_12),
            http("request_37")
              .post("/search/eventTracker?contentId=activitystream&itemType=activitystream&source=HOMEPAGE")
              .headers(headers_37),
            http("request_38")
              .get("/connections/opensocial/gadgets/ifr?url=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%2Fconnections%2Fresources%2Fweb%2Flconn.calendar%2FCalendarGadget.xml&container=default&view=default&lang=en&country=US&debug=0&nocache=0&sanitize=0&v=9afb79daf2d44f7d8188af41edb31c60&st=default%3Aypyl7lyCnHDPDx_pvNAU4zLyWc4TLXYSSqInLd8LosL5xSQR7SiaS9VZqwidvpvSa_7UACh5h1uuWaNd4lr-NtqP1-aj53zDfQqn1hFYiIEIRmKskiC7fY1iM8WySqaD74Fgi4YbxWCNff0K-RuM9LnbQa8vutSPAWnCZ0DQX57ahHNgaYZsevHYYgl8nDNlTH5NO5xySEsB_EN34ee0O-8bzECnOUTlg7uOMbwQM93FYWhVi_vXomSjHmOLt0V6ggfFe7kP3TBCBaTt5n5YhcM40GdgIB6F-K5Qb-eQbOJEDCAHqgAwEfLSuPJddvEg&testmode=0&parent=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com&mid=0")
              .headers(headers_38),
            http("request_39")
              .get("/connections/resources/web/_js?include=lconn.core.ckeditorstatic&exclude=lconn.core.ckeditor~&etag=20221026.163213&lang=en&country=US")
              .headers(headers_7),
            http("request_40")
              .get("/connections/resources/web/_style?include=com.ibm.lconn.core.styles.oneui3/base/package3.css&etag=20221026.163213")
              .headers(headers_3),
            http("request_41")
              .get("/connections/opensocial/gadgets/js/core:cre.util.ready:opensocial:rpc:shindig.uri:com.ibm.connections.theme:opensocial-data-context:embedded-experiences:osapi:sso-domain:open-views:settitle:dynamic-width:opensocial-0.9:smartcloud3:dynamic-height:views.js?container=default&nocache=0&debug=0&c=0&v=8ccd60662ed54cc7ffd7eb617031c794&jsload=0")
              .headers(headers_7),
            http("request_42")
              .get("/connections/resources/web/_style?include=com.ibm.lconn.core.styles.oneui3/sprites.css&etag=20221026.163213")
              .headers(headers_3),
            http("request_43")
              .get("/connections/resources/web/com.ibm.oneui.ckeditor/editor/skins/ibmdesign/skin.js?t=J4E1&etag=20221026.163213")
              .headers(headers_7),
            http("request_44")
              .get("/connections/resources/web/com.ibm.oneui.ckeditor/editor/skins/ibmdesign/editor_webkit.css?t=J4E1&etag=20221026.163213")
              .headers(headers_3),
            http("request_45")
              .get("/connections/resources/web/_js?include=dojo.main~&etag=20221026.163213&lang=en&country=us")
              .headers(headers_7),
            http("request_46")
              .get("/connections/resources/web/_js?include=lconn.calendar.calendarGadgetApp~&exclude=dojo.main&etag=20221026.163213&lang=en&country=us")
              .headers(headers_7),
            http("request_47")
              .get("/communities/calendar/atom_form/follow?startDate=2023-08-09T13%3A07%3A00%2B05%3A30&page=1&ps=5&type=all&lang=en_us&anonymous=true")
              .headers(headers_47),
            http("request_48")
              .get("/connections/resources/web/com.ibm.lconn.core.styles.oneui3/images/loading.gif?etag=20221026.163213")
              .headers(headers_13),
            http("request_49")
              .get("/connections/resources/web/com.ibm.oneui.styles/css/images/blank.gif?etag=20221026.163213")
              .headers(headers_13),
            http("request_50")
              .get("/connections/resources/web/com.ibm.lconn.core.styles.oneui3/images/lotusSprite-8bit.png?etag=20221026.163213")
              .headers(headers_13),
            http("request_51")
              .get("/communities/widgetInfoPersistence.do?resourceType=community&resourceId=&format=json")
              .headers(headers_51),
            http("request_52")
              .get("/ic360/ui/api/admin-banner/config.json")
              .headers(headers_51),
            http("request_53")
              .get("/connections/resources/web/user/roles?role=metrics-report-run&role=admin&role=global-moderator&role=invite-user&role=mail-user")
              .headers(headers_51),
            http("request_54")
              .get("/selfservice/acl/invite")
              .headers(headers_51),
            http("request_55")
              .get("/connections/resources/web/com.ibm.oneui.ckeditor/editor/styles.js?t=J4E1&etag=20221026.163213")
              .headers(headers_7),
            http("request_56")
              .get("/connections/opensocial/rest/people/@me/@self?fields=userSettings.cnx8HomepageTours")
              .headers(headers_51),
            http("request_57")
              .get("/connections/resources/web/com.ibm.oneui.ckeditor/editor/plugins/ibmbasiceditor/plugin.js?t=J4E1&etag=20221026.163213")
              .headers(headers_7),
            http("request_58")
              .get("/connections/resources/web/_style?include=com.ibm.lconn.core.styles.oneui3/sprites.css&etag=20221026.163213")
              .headers(headers_3),
            http("request_59")
              .get("/connections/resources/web/_lconntheme/hikari.css?version=oneui3&rtl=false&etag=20221026.163213")
              .headers(headers_3),
            http("request_60")
              .get("/connections/resources/web/com.ibm.oneui.ckeditor/editor/contentsLite.css?t=J4E1&etag=20221026.163213")
              .headers(headers_3),
            http("request_61")
              .get("/appregistry/api/v3/extensions?locale=en-us")
              .headers(headers_51)
              .check(status().is(404)),
            http("request_62")
              .get("/profiles/photo.do?userid=4cbc45c0-16a7-1033-9239-95472f45d54f")
              .headers(headers_13),
            http("request_63")
              .get("/connections/resources/web/com.ibm.oneui3.styles/imageLibrary/Icons/ComponentsDarkBlue/Home_Browser.ico?etag=20221026.163213")
              .headers(headers_13)
          */)
      )
      .pause(7)
      .exec(
        http("Logout")
          .get("/connections/servlet-request-logout?post_logout_redirect_uri=https%3A%2F%2Fkeycloakbvt.cnx.cwp.pnp-hcl.com%2Frealms%2Fhcl%2Fprotocol%2Fopenid-connect%2Flogout%3Fpost_logout_redirect_uri%3Dhttps%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%2Fhomepage%26client_id%3Dhcl-cnx-oidc-client")
          .headers(headers_64)
      )
      .pause(3)
      .exec(
        http("confirmLogout")
          .post(uri2 + "/protocol/openid-connect/logout/logout-confirm?client_id=hcl-cnx-oidc-client&tab_id=QaSeB0npO-g")
          .headers(headers_2)
          .formParam("session_code", "z2wOdk6H6pUZZNa-yqyrijyiuuebGCyA4QI6CxIj2BU")
          .formParam("confirmLogout", "Logout")
          .resources(
            http("Logout3")
              .get("/connections/servlet-request-logout?sid=c1e683c9-54cc-4026-9e41-1956484d1742&iss=https%3A%2F%2Fkeycloakbvt.cnx.cwp.pnp-hcl.com%2Frealms%2Fhcl")
              .headers(headers_66),
            http("LogoutHomepage")
              .get("/homepage")
              .headers(headers_67)
              .check(status().is(401)),
            http("LoginPage")
              .get(uri2 + "/protocol/openid-connect/auth?response_type=code&client_id=hcl-cnx-oidc-client&scope=openid&state=nwq7hjtUTQjdgoUOWnXM1FedLwo0N8E30EsAsEx8_1691566658002&redirect_uri=https%3A%2F%2Flcauto145.cnx.cwp.pnp-hcl.com%3A443%2Foidcclient%2Fkeycloak")
              .headers(headers_1)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
