//package k8s.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TestController {
//
//    @Value("${MY_NODE_NAME}")
//    private String MY_NODE_NAME;
//
//    @Value("${MY_POD_NAME}")
//    private String MY_POD_NAME;
//
//    @Value("${MY_POD_NAMESPACE}")
//    private String MY_POD_NAMESPACE;
//
//    @Value("${MY_POD_IP}")
//    private String MY_POD_IP;
//
//    @Value("${MY_POD_SERVICE_ACCOUNT}")
//    private String MY_POD_SERVICE_ACCOUNT;
//
//    @GetMapping("/api/status")
//    public String test() {
//        return "Status -> returned by Pod \r\n" +
//                "MY_NODE_NAME: " + MY_NODE_NAME + "\r\n" +
//                "MY_POD_NAME: " + MY_POD_NAME + "\r\n" +
//                "MY_POD_NAMESPACE: " + MY_POD_NAMESPACE + "\r\n" +
//                "MY_POD_IP: " + MY_POD_IP + "\r\n" +
//                "MY_POD_SERVICE_ACCOUNT: " + MY_POD_SERVICE_ACCOUNT + "\r\n" +
//                "MY_NODE_NAME: " + MY_NODE_NAME + "\r\n";
//    }
//}
