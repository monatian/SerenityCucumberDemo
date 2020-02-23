#language: zh-CN

功能:百度搜索

  @selenium
  场景: 打开百度浏览器并搜索selenium
    假设我打开百度首页
    当我看到百度logo
    并且我输入关键词"selenium"
      并且点击搜索按钮
    那么我应该看到搜索"selenium"结果页面

  @cucumber
  场景: 打开百度浏览器并搜索cucumber
    假设我打开百度首页
    当我看到百度logo
    并且我输入关键词"cucumber"
    并且点击搜索按钮
    那么我应该看到搜索"cucumber"结果页面