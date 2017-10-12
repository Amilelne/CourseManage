package settingcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

		//������List�������,�Ա������ݿ�����Ӳ���
		private List<Course> courses = new ArrayList<Course>();
		
		//Ĭ�Ϲ��캯������Ӳ�������,�Թ�����
		public CourseService() {
			courses.add(new Course("0","J2EE","����","����104"));
			courses.add(new Course("1","OOAD","����","����205"));
			courses.add(new Course("2", "�������", "������", "����208"));
		}
		
		//һ���򵥵�ͨ��id����ȡ�γ����Ƶĺ���
		public String getCourseNameById(int id) {
			return courses.get(id).getName().toString();
		}
}
