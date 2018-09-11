package org.zerock.listener;

import org.zerock.domain.MenuVO;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//웹 어플리케이션이 동작하면 항상 리스너부터 호출한다.
//Listener를 상속받으므로 항상 리스너부터 호출한다.
@WebListener
public class MenuLoader implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {


        List<MenuVO> menuVOList = new ArrayList<MenuVO>();
        Map<Integer,MenuVO> menuVOMap = new HashMap<Integer, MenuVO>();

        for(int i=0; i<10 ; i++){
            MenuVO vo = new MenuVO(i,"메뉴"+i,i*1000);
            menuVOList.add(vo);
            menuVOMap.put(i,vo);
        }

        //application 내 모든 파일에 공유할 수 있게 만들어준다.
        sce.getServletContext().setAttribute("menuList",menuVOList);
        sce.getServletContext().setAttribute("menuMap",menuVOMap);

    }
}
