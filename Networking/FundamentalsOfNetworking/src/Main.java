import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        /**
         * ADVANTAGES OF JAVA NETWORKING
         * - sharing resources
         * - centralize software managament
         * ---------------------------------------------
         * java.net package suppport two protocol:
         * UDP AND TCP
         * ---------------------------------------------
         * JAVA NETWORKİNG TERMİNOLOGY
         * widely used java networking terminilogies are given below:
         *  1 - Ip Address
         *  2 - Protocol
         *  3 - Port Number
         *  4 - MAC Address
         *  5 - Connected-oriented and connection-less protocol
         *  6 - Socket
         *  ------------------------------------------------
         * java.net PACKAGE
         *  1 - Low-Level API: it deals with the abstraction of address.
         *      i.e: networking identifiers, Sockets
         *      i.e: bidirectional data communication mechanism and Interfaces
         *      i.e: network interfaces
         *  2 - High-level API: it deals with the abstraction of URLs.
         *      i.e: universal resource identifier, URLs
         *      i.e: universal resource locator, and connections
         *      i.e: connections to the resource by URLs
         *
         *  java.net package provies many classes to deal with networking application
         *  in Java. Here are these classes list:
         *      - Authenticator
         *      - CacheRequest
         *      - CacheResponse
         *      - ContentHandler
         *      - CookieHandler
         *      - CookieMangaer
         *      - DatagramPacket
         *      - DatagramSocket
         *      - DatagramSocketLMPL
         *      - InterfaceAddress
         *      - JarURLConnection
         *      - MulticastSocket
         *      - InetSocketAddress
         *      - InetAddress
         *      - more classes are here...
         *  List of interfaces available n java.net package
         *      - ContentHandlerFactory
         *      - CookiePolicy
         *      - CookieStore
         *      - DatagramSocketLMPLFactory
         *      - FileNameMap
         *      - SocketOption<T>
         *      - SocketOptions
         *      - ProtocolFamily
         *      - URLStreamHandlerFactory
         *      ---------------------------------------
         *      SOCKET CLASS
         *
         *          IMPORTANT METODS
         *          1- public InputStream getInputStream() ---> bu sokete eklenen
         *          InputStreamı return eder
         *          2- public OutputStream getOutputStream() --->bu sokete eklenen
         *          OutputStreamı return eder
         *          3 - public synchronized void close() ---> soketi kapatır
         *
         *      SERVERSOCKET CLASS
         *
         *          Important Methods
         *          1 - public Socket accept() ---> soketi return eder ve sunucu ile
         *          istemci arasında bağlantı kurar
         *          2 - public synchrnized void close() ---> serversoketi kapatır
         */
        // creating server
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();

        // creating client
        Socket client = new Socket("localhost", 6666);




    }
}