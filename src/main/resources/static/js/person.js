$(function() {

	var oTableInit = new Object();

	var oInit = new Object();

	$('#person').bootstrapTable({

		data: [

			{
				"id": "10001",
				"name": "张三",
				"sex": "男",
				"age": 35
			},
			{
				"id": "10001",
				"name": "张三",
				"sex": "男",
				"age": 35
			},
			{
				"id": "10001",
				"name": "张三",
				"sex": "男",
				"age": 35
			},
			{
				"id": "10001",
				"name": "张三",
				"sex": "男",
				"age": 35
			},
			{
				"id": "10001",
				"name": "张三",
				"sex": "男",
				"age": 35
			}
		],

		paginationPreText: '<', //上下翻页

		paginationNextText: '>',

		detailView: true, //父子表

		striped: true, //是否显示行间隔色

		pagination: true, //是否显示分页（*）

		sortOrder: "asc", //排序方式

		pageNumber: 1, //初始化加载第一页，默认第一页

		height: 400,

		pageSize: 10, //每页的记录行数（*）

		pageList: [10, 20], //可供选择的每页的行数（*）

		columns: [{

				title: "人员信息",

				formatter: function(value, row, index) {

					return index + 1;

				},

				rowspan: 1,

				align: 'center',

				width: '50px'

			}, {

				field: 'id',

				title: '编号',

				align: 'left',

			}, {

				field: 'name',

				title: '姓名',

				align: 'left',

			}, {

				field: 'sex',

				title: '性别',

				align: 'center',



			}, {

				field: 'age',

				title: '年龄',

				align: 'right',

			}

		],

		onExpandRow: function(index, row, $detail) {

			oTableInit.InitSubTable(index, row, $detail);

		}

	});







	oTableInit.InitSubTable = function(index, row, $detail) {

		var parentid = row.MENU_ID;

		var cur_table = $detail.html('<table></table>').find('table');

		$(cur_table).bootstrapTable({

			data: [			
			{
				"id": "入职时间",
				"name": "1996.03.12",

			},
			{
				"id": "生日",
				"name": "1912.04.06",
			},
			{
				"id": "部门",
				"name": "信息部",
			},
			{
				"id": "职位",
				"name": "员工",
			},


			],

			method: 'get',

			queryParams: {
				strParentID: parentid
			},

			ajaxOptions: {
				strParentID: parentid
			},

			clickToSelect: true,

			pagination: true, //是否显示分页（*）

			sortOrder: "asc", //排序方式

			pageNumber: 1, //初始化加载第一页，默认第一页

			height: 260,

			pageSize: 6, //每页的记录行数（*）

			pageList: [6, 12, 24, 48], //可供选择的每页的行数（*）

			paginationPreText: '<', //上下翻页

			paginationNextText: '>',

			columns: [

					{

					field: 'id',

					title: '子编号',

					align: 'left',

				}, {

					field: 'name',

					title: '姓名',

					align: 'left',

				}

			],

			//无线循环取子表，直到子表里面没有记录

			onExpandRow: function(index, row, $Subdetail) {

				oInit.InitSubTable(index, row, $Subdetail);

			}

		});

		return oTableInit;

	};



});
