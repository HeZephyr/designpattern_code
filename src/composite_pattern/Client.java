package composite_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/25 19:37
 */
public class Client {
    public static void main(String[] args) {
        // 文件夹
        AbstractFile myFolder, imageFolder, textFolder, videoFolder;
        AbstractFile imageFile1, imageFile2, textFile1, textFile2, videoFile1, videoFile2;

        myFolder = new Folder("我的资料");
        imageFolder = new Folder("图像文件");
        textFolder = new Folder("文本文件");
        videoFolder = new Folder("视频文件");

        imageFile1 = new ImageFile("小龙女.jpg");
        imageFile2 = new ImageFile("张无忌.gif");

        textFile1 = new TextFile("九阴真经.txt");
        textFile2 = new TextFile("葵花宝典.doc");

        videoFile1 = new VideoFile("笑傲江湖.mp4");
        videoFile2 = new VideoFile("神雕侠侣.rmvb");

        imageFolder.add(imageFile1);
        imageFolder.add(imageFile2);

        textFolder.add(textFile1);
        textFolder.add(textFile2);

        videoFolder.add(videoFile1);
        videoFolder.add(videoFile2);

        myFolder.add(imageFolder);
        myFolder.add(textFolder);
        myFolder.add(videoFolder);

        myFolder.killVirus();
    }
}
