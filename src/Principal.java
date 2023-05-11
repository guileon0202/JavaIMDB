import java.io.IOException;
import org.json.JSONObject;
import org.json.JSONException;
import okhttp3.Response;
import okhttp3.OkHttpClient;
import okhttp3.Request;


public class Principal {
	public static void main(String[] args) throws IOException, JSONException {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = new Request.Builder().url("https://imdb-api.com/en/API/Top250Movies/k_bds8ia6w")
				.method("GET", null).build();
		Response response = client.newCall(request).execute();
		
		String retorno = response.body().string();
		JSONObject myResponse = new JSONObject(retorno);
		
		System.out.println(myResponse);
	}
}
