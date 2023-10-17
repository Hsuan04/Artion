package com.tha103.artion.activityComment.model;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;

import com.tha103.artion.activity.model.ActivityVO;
import com.tha103.artion.member.model.MemberVO;

import util.HibernateUtil;

public class TestSave {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();

            ActivityCommentVO actCom = new ActivityCommentVO();

            // 設定會員
            int memberId = 7001; 
            MemberVO member = session.get(MemberVO.class, memberId);
            actCom.setMember(member);

            // 設定活動
            int activityId = 10001; 
            ActivityVO activity = session.get(ActivityVO.class, activityId);
            actCom.setActivity(activity);

            actCom.setActComContent("這個活動很讚");
            actCom.setActComReportTimes(1);
            actCom.setActComLikeTimes(50);
            try {
                byte[] coverpicture = writePicture("C:/Users/Tibame_T14/Desktop/java養成班/專題/Artion/image/留言圖片.jpg");
                byte[] actpicture1 = writePicture("C:/Users/Tibame_T14/Desktop/java養成班/專題/Artion/image/留言圖片2.jpg");
                byte[] actpicture2 = writePicture("C:/Users/Tibame_T14/Desktop/java養成班/專題/Artion/image/留言圖片3.jpg");
                byte[] actpicture3 = writePicture("C:/Users/Tibame_T14/Desktop/java養成班/專題/Artion/image/留言圖片4.jpg");
                actCom.setActComCoverPicture(coverpicture);
                actCom.setActComPicture1(actpicture1);
                actCom.setActComPicture2(actpicture2);
                actCom.setActComPicture3(actpicture3);
            } catch (IOException e) {
                e.printStackTrace();
            }

            session.save(actCom);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }


    private static byte[] writePicture(String imagePath) throws IOException {
        FileInputStream fis = new FileInputStream(imagePath);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        fis.close();
        return bos.toByteArray();
    }
}
