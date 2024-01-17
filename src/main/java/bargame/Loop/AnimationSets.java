package bargame.Loop;

import javafx.scene.image.Image;

public enum AnimationSets implements AnimationControls {
    example () {
        public enum frame {
            FRAME1(null),
            FRAME2(null);

            final Image img;
            frame (Image img) {
                this.img = img;
            }
        }
        @Override
        public Image getImage(int index) {
            return null;
        }

        @Override
        public int getFrameCount() {
            return 2;
        }

        @Override
        public Image[] getFrames() {
            frame[] val = frame.values();
            Image[] imgs = new Image[val.length];
            for (int a = 0; a < val.length; a++) {
                imgs[a] = val[a].img;
            }
            return imgs;
        }
    },

    exampleTwo () {
        @Override
        public Image getImage(int index) {
            return null;
        }

        @Override
        public int getFrameCount() {
            return 2;
        }

        @Override
        public Image[] getFrames() {
            return new Image[0];
        }
    }
}
