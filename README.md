# Dagger2Demo
A simple demo for Dagger2
#Configuration
build.gradle file of Project:
```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        ...
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}
```
build.gradle file of module
```
apply plugin:'com.neenbedankt.android-apt'

dependencies {
    ...
    apt 'com.google.dagger:dagger-compiler:2.5'
    compile 'org.glassfish:javax.annotation:10.0-b28'
}
```
#Usage
1.Create your model files

2.Create component files just as the following:(the component file is mainly used for connecting the models and modules)
```
@Component(
        modules=ActivityModule.class
)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
```
3.Create module files
```
@Module
public class ActivityModule {

    @Provides
    public UserModel provideUserModel(){
        return new UserModel("1","vivian","woman");
    }

    @Provides
    public CompanyModel provideCompanyModel(){
        return new CompanyModel("钛媒体","1231231","呼家楼");
    }
}
```
#Things that may confuse you
1.When you write demo by yourself,you may come up with the problem like this:
<code>Cannot resolve symbol 'DaggerActivityComponent'</code>

And this file was generated by Dagger2 when you've finish your model files and module files.

So if you cannot find this class,maybe you can try to clean the project and build it again.