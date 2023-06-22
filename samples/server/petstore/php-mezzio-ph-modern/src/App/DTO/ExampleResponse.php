<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

/**
 * dummy
 */
class ExampleResponse
{
    #[DTA\Data(field: "myOnlyProperty", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\OtherObject::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\OtherObject::class])]
    public \App\DTO\OtherObject|null $my_only_property = null;

}
