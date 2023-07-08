package stub;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

@Path("/stub")
public class JsonStub {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String postJson() {
		LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

		String fdate1 = dtformat.format(date1); // 表示形式+Stringに変換

		String str = "{\"id\": \"cmpl-4kGh7iXtjW4lc9eGhff6Hp8C7btdQ\","
				+ "\"object\":\"text_completion\",\"created\": 1646932609, \"model\": \"ada\","
				+ "\"choices\": [{\"text\": \"これはダミーです。日時：" + fdate1
				+ "\",\"index\": 0, \"logprobs\": null, \"finish_reason\": \"length\"}]}";

		JSONObject jsonObject = new JSONObject(str);
		return jsonObject.toString();
	}

}
