package kz.kasya.app.service;

import com.fasterxml.jackson.core.type.TypeReference;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;


/**
 * @author Assylkhan
 * on 1.04.2022
 *
 * Custom service which intended to work with REST API
 *
 * @project app
 */
public class ApiClientService {
    private static final String BASE_URL;
    private static final OkHttpClient client;

    private ApiClientService() {
    }

    static {
        BASE_URL = ConfigReaderService.instance.getApiBase();
        client = new OkHttpClient();
    }

    private static String wrapUri(String uri) {
        return  BASE_URL + uri;
    }

    /**
     * Method which takes request uri, query params and dynamic type
     * reference in order to map result into specific type
     *
     * !!Important. Works only with json formatted remote services, shortly REST
     */
    public static <E> E get(String uri, Map<String, String> queryParams, TypeReference<E> typeReference) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(wrapUri(uri)).newBuilder();

        queryParams.keySet().forEach(e -> urlBuilder.addQueryParameter(e, queryParams.get(e)));

        Request request = new Request.Builder()
                .url(urlBuilder.build().toString())
                .get()
                .build();
        Call call = client.newCall(request);

        Response response = call.execute();

        /**
         * Here we are going to map json text result into java object
         */
        return MapperService.instance.readValue(response.body().string(), typeReference);
    }
}
