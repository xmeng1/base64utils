import org.apache.commons.codec.binary.Base64
import spock.lang.Specification


/**
 * Created by mengxin on 10/06/2017.
 */
class Base64Spec extends Specification {
    /*
    The target of this test will compare all the implementation of the
    base64 encode and decode method.

    Meanwhile, check the string with return character.


     */
    String str1 = "this is test string."
    String str2 = "this is test string.\n next line."
    String str3 = "this is test string."
    String str4 = "this is test string."
    String str5 = "this is test string."
    String str6 = "Man is distinguished, not only by his reason, but by this singular passion from\n" +
            "other animals, which is a lust of the mind, that by a perseverance of delight\n" +
            "in the continued and indefatigable generation of knowledge, exceeds the short\n" +
            "vehemence of any carnal pleasure."
    String base64Str6 = "TWFuIGlzIGRpc3Rpbmd1aXNoZWQsIG5vdCBvbmx5IGJ5IGhpcyByZWFzb24sIGJ1dCBieSB0aGlz" +
            "IHNpbmd1bGFyIHBhc3Npb24gZnJvbSBvdGhlciBhbmltYWxzLCB3aGljaCBpcyBhIGx1c3Qgb2Yg" +
            "dGhlIG1pbmQsIHRoYXQgYnkgYSBwZXJzZXZlcmFuY2Ugb2YgZGVsaWdodCBpbiB0aGUgY29udGlu" +
            "dWVkIGFuZCBpbmRlZmF0aWdhYmxlIGdlbmVyYXRpb24gb2Yga25vd2xlZGdlLCBleGNlZWRzIHRo" +
            "ZSBzaG9ydCB2ZWhlbWVuY2Ugb2YgYW55IGNhcm5hbCBwbGVhc3VyZS4="
    String str7 = "abcdefg\r\nabcdefg"
    // http://base64encode.net/
    String str7Base64X1 = "YWJjZGVmZw0KYWJjZGVmZw=="
    // https://www.base64encode.org/
    String str7Base64X2 = "YWJjZGVmZw0KYWJjZGVmZw=="
    // https://www.samltool.com/base64.php
    String str7Base64X3 = "YWJjZGVmZw0KYWJjZGVmZw=="
    // http://base64.duttke.de/
    String str7Base64X4 = "YWJjZGVmZwphYmNkZWZn"
    // http://www.utilities-online.info/base64/#.WTwloBPyuRs
    String str7Base64X5 = "YWJjZGVmZwphYmNkZWZn"


    String base64Str6_2 = "TWFuIGlzIGRpc3Rpbmd1aXNoZWQsIG5vdCBvbmx5IGJ5IGhpcyByZWFzb24sIGJ1dCBieSB0aGlz" +
            "IHNpbmd1bGFyIHBhc3Npb24gZnJvbQ0Kb3RoZXIgYW5pbWFscywgd2hpY2ggaXMgYSBsdXN0IG9mIHRoZSBtaW5kLCB0aGF0IGJ5IGEgcGVyc2V2ZXJhbmNlIG9mIGRlbGlnaHQNCmluIHRoZSBjb250aW51ZWQgYW5kIGluZGVmYXRpZ2FibGUgZ2VuZXJhdGlvbiBvZiBrbm93bGVkZ2UsIGV4Y2VlZHMgdGhlIHNob3J0DQp2ZWhlbWVuY2Ugb2YgYW55IGNhcm5hbCBwbGVhc3VyZS4="
    Base64 apacheBase64 = new Base64()

    def "test base64 encode and decode"(){

        when:

        String apacheBase64Str1 = apacheBase64.encodeAsString(str1.getBytes())

        String java8Base64Str1 = java.util.Base64.encoder.encodeToString(str1.getBytes())

        String apacheBase64Str2 = apacheBase64.encodeAsString(str2.getBytes())

        String java8Base64Str2 = java.util.Base64.encoder.encodeToString(str2.getBytes())

        String apacheBase64Str6 = apacheBase64.encodeAsString(str6.getBytes())

        String java8Base64Str6 = java.util.Base64.encoder.encodeToString(str6.getBytes())


        String apacheBase64Str7 = apacheBase64.encodeAsString(str7.getBytes())

        String java8Base64Str7 = java.util.Base64.encoder.encodeToString(str7.getBytes())


        then:
//        apacheBase64Str1 == java8Base64Str1
//        println(apacheBase64Str1)
//        println(java8Base64Str1)
//        println("Str2")
//        apacheBase64Str2 == java8Base64Str2
//        println(apacheBase64Str2)
//        println(java8Base64Str2)
//        println("dGhpcyBpcyB0ZXN0IHN0cmluZy4NCiBuZXh0IGxpbmUu")
//        //dGhpcyBpcyB0ZXN0IHN0cmluZy4NCiBuZXh0IGxpbmUu
//        //dGhpcyBpcyB0ZXN0IHN0cmluZy4NCiBuZXh0IGxpbmUu
//        //dGhpcyBpcyB0ZXN0IHN0cmluZy4KIG5leHQgbGluZS4=
//
//        apacheBase64Str6 == java8Base64Str6
//        println(apacheBase64Str6)
//        println(java8Base64Str6)
//        //base64Str6_2 == java8Base64Str6
//        base64Str6 == java8Base64Str6

        apacheBase64Str7 == java8Base64Str7
        println(apacheBase64Str7)
        println(java8Base64Str7)
        apacheBase64Str7 == str7Base64X5
        //                       YWJjZGVmZw0KYWJjZGVmZw==
        //String str7Base64X3 = "YWJjZGVmZw0KYWJjZGVmZw=="
    }

}