//
// Created by Administrator on 2018\5\9 0009.
//

#include "jnidemo_cn_example_com_jnidemo_MainActivity.h"
JNIEXPORT jstring JNICALL Java_jnidemo_cn_example_com_jnidemo_MainActivity_getString
        (JNIEnv * env, jobject obj)
{
    return env->NewStringUTF("this is a tring from jni!");
}