package sebms.web;

public class JsonResponse {

	private boolean result = false;
	private Object data;
	private String error;
	
	public JsonResponse(Object data){
		this.data = data;
	}
	
	public JsonResponse(String error){
		this.error = error;
	}
	
	public JsonResponse(Object data, String error) {
		this.data = data;
		this.error = error;
	}

	public JsonResponse(){}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	
}
