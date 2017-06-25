package conference.entity;

import java.util.List;


/**
 * Entity conference
 * 
 * @author fblesa
 *
 */
public class Conference {
	
	private List<Thematic> listThematics;

	public List<Thematic> getListThematics() {
		return listThematics;
	}

	public void setListThematics(List<Thematic> listThematics) {
		this.listThematics = listThematics;
	}
}
